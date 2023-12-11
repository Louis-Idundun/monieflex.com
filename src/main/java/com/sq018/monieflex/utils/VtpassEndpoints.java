package com.sq018.monieflex.utils;

public class VtpassEndpoints {
    private static String BASE_URL = "https://sandbox.vtpass.com/api";

    /**
     * ServiceID = gotv, dstv, startimes, showmax
     */
    public static String VARIATION_URL(String id) {
        return BASE_URL + "/service-variations?serviceID=%s".formatted(id);
    };

    /**
     * ServiceID = ikeja-electric, eko-electric, kano-electric, portharcourt-electric, jos-electric,
     * ibadan-electric, kaduna-electric, abuja-electric, enugu-electric, benin-electric, aba-electric
     */
    public static String PAY = BASE_URL + "/pay";

    public static String VERIFY_NUMBER = BASE_URL + "/merchant-verify";
}
