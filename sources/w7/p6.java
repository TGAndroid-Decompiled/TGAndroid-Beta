package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class p6 {
    public static li.k a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = k7.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(k7.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        oc.a aVar = new oc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, k7.a(jSONObject2.optString("name")), k7.a(jSONObject2.optString("address_line1")), k7.a(jSONObject2.optString("address_line2")), k7.a(jSONObject2.optString("address_city")), k7.a(jSONObject2.optString("address_state")), k7.a(jSONObject2.optString("address_zip")), k7.a(jSONObject2.optString("address_country")), m7.a(k7.a(jSONObject2.optString("brand"))), k7.a(jSONObject2.optString("last4")), k7.a(jSONObject2.optString("fingerprint")), m7.b(k7.a(jSONObject2.optString("funding"))), k7.a(jSONObject2.optString("country")), k7.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new li.k(a2, valueOf, aVar, str2);
    }
}
