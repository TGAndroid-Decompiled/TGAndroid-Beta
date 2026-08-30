package p2;

import org.json.JSONObject;
public final class l {
    public final String f41002a;
    public final long f41003b;
    public final String f41004c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f41004c = jSONObject.optString("priceCurrencyCode");
        this.f41002a = jSONObject.optString("formattedPrice");
        this.f41003b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
