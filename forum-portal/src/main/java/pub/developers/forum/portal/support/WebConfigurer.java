package pub.developers.forum.portal.support;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Resource
    private GlobalViewInterceptor globalViewInterceptor;

    @Resource
    private CorsInterceptor corsInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(globalViewInterceptor)
                .addPathPatterns("/**");
        registry.addInterceptor(corsInterceptor)
                .addPathPatterns("/**");
    }

}
