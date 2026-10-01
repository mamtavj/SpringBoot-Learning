package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//when you have multiple related properties, instead of using many @Values,
// you can group them into one Java class.

@Component
@ConfigurationProperties("payment-property")

public class PaymentProperties {

    private String type;
    private int retryCount;
    private boolean isEnabled;
    private int timeout;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}

//---------------------------------------------------------------------------------
// @ConfigurationProperties("payment-property")
// "payment-property" is the prefix.
// Spring maps all properties starting with this prefix
// to the fields of this class.