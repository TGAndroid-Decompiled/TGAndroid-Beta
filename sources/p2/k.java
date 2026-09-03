package p2;

import org.json.JSONObject;
public final class k {
    public final String f44185a;
    public final long f44186b;
    public final String f44187c;
    public final String d;

    public k(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f44187c = jSONObject.optString("priceCurrencyCode");
        this.f44185a = jSONObject.optString("formattedPrice");
        this.f44186b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
