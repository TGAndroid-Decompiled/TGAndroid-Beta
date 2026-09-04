package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class y7 {
    public static m2.t a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = q8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(q8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, q8.a(jSONObject2.optString("name")), q8.a(jSONObject2.optString("address_line1")), q8.a(jSONObject2.optString("address_line2")), q8.a(jSONObject2.optString("address_city")), q8.a(jSONObject2.optString("address_state")), q8.a(jSONObject2.optString("address_zip")), q8.a(jSONObject2.optString("address_country")), s8.a(q8.a(jSONObject2.optString("brand"))), q8.a(jSONObject2.optString("last4")), q8.a(jSONObject2.optString("fingerprint")), s8.b(q8.a(jSONObject2.optString("funding"))), q8.a(jSONObject2.optString("country")), q8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new m2.t(a2, valueOf, aVar, str2);
    }
}
