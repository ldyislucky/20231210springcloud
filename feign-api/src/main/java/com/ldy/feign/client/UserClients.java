package com.ldy.feign.client;


import com.ldy.feign.client.fallback.UserClientFallbackFactory;
import com.ldy.feign.entity.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallbackFactory = UserClientFallbackFactory.class)//服务名称前边不要加“/”
public interface UserClients {
    @GetMapping("/tb-user/user/{id}")
    TbUser getById(@PathVariable("id") Long id);

}
