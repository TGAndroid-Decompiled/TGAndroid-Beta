package p2;

import org.json.JSONObject;
public final class j {
    public final String f45466a;
    public final long f45467b;
    public final String f45468c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f45468c = jSONObject.optString("priceCurrencyCode");
        this.f45466a = jSONObject.optString("formattedPrice");
        this.f45467b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
