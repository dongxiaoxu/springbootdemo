package site.dongxiaoxu.springbootdemo.config;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

public class UserInfoArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().equals(UserInfo.class) && methodParameter.hasParameterAnnotation(UserInfoParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        if (methodParameter.hasParameterAnnotation(UserInfoParam.class)) {
            HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
            request.setAttribute("userName", "dongxu2");
            return new UserInfo("dongxu", "123", "董旭");
        }

        return null;
    }
}
