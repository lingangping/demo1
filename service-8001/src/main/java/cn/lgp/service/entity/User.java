package cn.lgp.service.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName
public class User {

    private String avatar;
    private String nickName;
    private String companyName;
    private String sessionId;

}
