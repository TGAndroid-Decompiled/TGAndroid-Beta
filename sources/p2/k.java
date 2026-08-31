package p2;

import org.json.JSONObject;
public final class k {
    public final String f44154a;
    public final long f44155b;
    public final String f44156c;
    public final String d;

    public k(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f44156c = jSONObject.optString("priceCurrencyCode");
        this.f44154a = jSONObject.optString("formattedPrice");
        this.f44155b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
