package com.example.config;

import com.example.component.LoginHandlerInterceptor;
import com.example.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//扩展SpringMvc的功能
@Configuration
//@EnableWebMvc 这个注解会完全接管springmvc的自动配置
public class MyMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello3").setViewName("success");
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("index.html")
                        .excludePathPatterns("login")
                        .excludePathPatterns("login.html")
                        .excludePathPatterns("index");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/hello4").setViewName("success");
                registry.addViewController("/dashboard").setViewName("dashboard");
            }


        };
        return adapter;
    }

    /**
     * 国际化支持
     */
    @Bean
    public MyLocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
