package com.alpha.payrollsolutuions;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
  @Override
  public void addViewControllers(final ViewControllerRegistry registry) {
    registry.addRedirectViewController("/", "/swagger-ui/#/");
    // use setStatusCode(HttpStatus.XYZ) for any custom status code if required, e.g. MOVED_PERMANENTLY
    registry.addRedirectViewController("/swagger-ui", "/swagger-ui/#/");
    // any other alias
  }
}