package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class l5 {
    public static s4.d a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = a8.r0.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(a8.r0.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        xc.a aVar = new xc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, a8.r0.a(jSONObject2.optString("name")), a8.r0.a(jSONObject2.optString("address_line1")), a8.r0.a(jSONObject2.optString("address_line2")), a8.r0.a(jSONObject2.optString("address_city")), a8.r0.a(jSONObject2.optString("address_state")), a8.r0.a(jSONObject2.optString("address_zip")), a8.r0.a(jSONObject2.optString("address_country")), a8.t0.a(a8.r0.a(jSONObject2.optString("brand"))), a8.r0.a(jSONObject2.optString("last4")), a8.r0.a(jSONObject2.optString("fingerprint")), a8.t0.b(a8.r0.a(jSONObject2.optString("funding"))), a8.r0.a(jSONObject2.optString("country")), a8.r0.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new s4.d(a2, valueOf, aVar, str2);
    }
}
