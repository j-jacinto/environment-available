package com.example.environment_available.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MsType {

    PARTNER_APP_CONTROLLER("partner-app-controller"),
    PARTNER_REGISTRATION("partner-registration"),
    PARTNER_BONUS_B2C("partner-bonus-b2c"),
    PARTNER_BACKOFFICE("partner-backoffice"),
    CUSTOMER_B2B("customer-b2b"),
    CUSTOMER_PROFILE("customer-profile"),
    CUSTOMER("customer"),
    PARTNER_BONUS_B2B("partner-bonus-b2b"),
    PARTNER_BILLING("partner-billing"),
    PARTNER_WORKLOG("partner-worklog"),
    ACCESS_MANAGEMENT("access-management"),
    CARDLINKED("cardlinked"),
    COUPON_MANAGEMENT("coupon-management"),
    PARTNER_INFO("partner-info"),
    ACCRUAL_CALCULATOR("accrual-calculator");

    private String description;
}
