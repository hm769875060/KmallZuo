package cn.lhm.kmall.managerweb.WebMvc;


import com.google.common.net.HttpHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfig {
   @Bean
   public WebMvcConfigurer corsConfigurer( ){
       return new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**")
                       .allowedOrigins("http://127.0.0.1:8888")
                       .allowedMethods("*")
                       .allowedHeaders("*")
                       .allowCredentials(true)
                       .exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L);
           }
      };
   }
}
