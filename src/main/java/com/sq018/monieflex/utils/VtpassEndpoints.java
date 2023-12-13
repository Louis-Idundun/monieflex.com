package com.sq018.monieflex.utils;

import org.springframework.beans.factory.annotation.Value;

public class VtpassEndpoints {
    private static String BASE_URL = "https://sandbox.vtpass.com/api";

    /**
     * ServiceID(Tv) = gotv, dstv, startimes, showmax
     * ServiceID = gotv, dstv, startimes, showmax
     */
    public static String VARIATION_URL(String id) {
        return BASE_URL + "/service-variations?serviceID=%s".formatted(id);
    };

    public static String BUY_AIRTIME = BASE_URL + "/pay";
}

    public static String PAY = BASE_URL + "/pay";
}
