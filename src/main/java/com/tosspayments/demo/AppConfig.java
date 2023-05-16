package com.tosspayments.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppConfig {
    public static String tossServerKey;
    public static String tossClientKey;

    @Value("${toss.server}")
    public void setTossServerKey(String key) {
        tossServerKey = key;
    }

    @Value("${toss.client}")
    public void setTossClientKey(String key) {
        tossClientKey = key;
    }

}
