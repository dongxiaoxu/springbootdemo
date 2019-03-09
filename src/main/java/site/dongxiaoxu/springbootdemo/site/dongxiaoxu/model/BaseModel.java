package site.dongxiaoxu.springbootdemo.site.dongxiaoxu.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@Data
@EqualsAndHashCode
@MappedSuperclass
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "myuuid")
    @GenericGenerator(name = "myuuid", strategy = "uuid")
    private String id;
}
