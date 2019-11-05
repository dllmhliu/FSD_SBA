package com.ibm.fsd.sba.training.feign;

import com.ibm.fsd.sba.training.model.ResponseDto;
import com.ibm.fsd.sba.training.model.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user")
public interface UserFeign {

    @PostMapping("/user/controller/user/v1/findByUserId")
    ResponseDto<UserDto> findByUserId(@RequestParam Long id);
}
