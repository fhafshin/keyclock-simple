package com.example.security.config;


import org.springframework.context.event.EventListener;
import org.springframework.security.authorization.event.AuthorizationDeniedEvent;
import org.springframework.stereotype.Component;

@Component
//@Slf4j
public class AuthorizationEvent {



    @EventListener
    public void onFailer(AuthorizationDeniedEvent deniedEvent) {
//        log.info("Authentication failure {} dua to {} "
//                ,deniedEvent.getAuthentication().get().getName()
//                , deniedEvent.getAuthorizationResult());
    }
}
