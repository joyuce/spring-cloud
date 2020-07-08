package com.j.openproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joyuce
 * @Type User
 * @Desc 用户类
 * @date 2020年01月14日
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer userId;

    private String userName;
}
