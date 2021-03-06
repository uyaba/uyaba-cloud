package com.uyaki.cloud.microservices.service.hystrix;

import com.uyaki.cloud.common.core.wrapper.WrapMapper;
import com.uyaki.cloud.common.core.wrapper.Wrapper;
import com.uyaki.cloud.microservices.service.HelloFeignApi;
import org.springframework.stereotype.Component;

/**
 * fallback模式可以正常熔断，但是无法抛出异常
 * @author uyaki
 * @date 2019-08-02 08:45
 */
@Component
public class HelloFeignApiHystrix implements HelloFeignApi {
    @Override
    public Wrapper<String> sayHello(String somebody) {
        return WrapMapper.error(somebody+"熔断了");
    }
}
