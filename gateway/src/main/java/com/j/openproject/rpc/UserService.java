package com.j.openproject.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.j.openproject.base.CommonRs;
import com.j.openproject.dto.UserDto;

/**
 * @author Joyuce
 * @Type UserService
 * @Desc 用户服务
 * @date 2020年01月14日
 * @Version V1.0
 */
@FeignClient(value = "user-server", path = "/api/v2/user")
public interface UserService {

    /**
     * 校验token
     *
     * @param token
     * @param urlPath
     * @return
     */
    @RequestMapping(value = "/check/token", method = RequestMethod.GET)
    CommonRs<UserDto> checkToken(@RequestParam(value = "token") String token, @RequestParam(value = "urlPath") String urlPath);

}
