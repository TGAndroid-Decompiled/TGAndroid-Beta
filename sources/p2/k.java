package p2;

import org.json.JSONObject;
public final class k {
    public final String f41023a;
    public final long f41024b;
    public final String f41025c;
    public final String d;

    public k(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f41025c = jSONObject.optString("priceCurrencyCode");
        this.f41023a = jSONObject.optString("formattedPrice");
        this.f41024b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
