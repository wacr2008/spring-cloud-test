package com.superwind.feign;

import com.superwind.pojo.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-service"/*,fallback = UserServiceHystrix.class*/)
public interface IUserService {
    @RequestMapping(method = RequestMethod.POST, value = "/provider/addUser")
    public int addUser(@RequestBody UserInfo userInfo);
}
