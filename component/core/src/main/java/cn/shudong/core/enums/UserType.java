package cn.shudong.core.enums;

import cn.shudong.core.exception.GlobalException;
import cn.shudong.core.exception.GlobalExceptionCode;

/**
 *
 * 用户类型
 *
 * @author zhouqi
 * @date 2020/11/20 15:49
 * @version v1.0.0
 * @Description
 *
 */
public enum UserType {

    GENERAL(1, "普通用户"),
    ADMINISTRATOR(2, "管理员用户"),

    ;

    /**
     * 代码
     */
    private final int code;

    /**
     * 内容
     */
    private final String msg;


    /**
     * @param code 代码
     * @param msg  内容
     */
    UserType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * 根据代码获取枚举
     *
     *  @param code 枚举code
     * @return UserType
     */
    public static UserType getByCode(int code) {

        UserType[] values = UserType.values();

        for (UserType value : values) {
            if (value.getCode() == code) {
                return value;
            }
        }

        throw new GlobalException(GlobalExceptionCode.NOT_FOUND_ENUM, String.format("未找到 [%s] 对应的用户类型!", code));
    }


}
