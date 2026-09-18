package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class z7 {
    public static lf.i a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = r8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(r8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, r8.a(jSONObject2.optString("name")), r8.a(jSONObject2.optString("address_line1")), r8.a(jSONObject2.optString("address_line2")), r8.a(jSONObject2.optString("address_city")), r8.a(jSONObject2.optString("address_state")), r8.a(jSONObject2.optString("address_zip")), r8.a(jSONObject2.optString("address_country")), t8.a(r8.a(jSONObject2.optString("brand"))), r8.a(jSONObject2.optString("last4")), r8.a(jSONObject2.optString("fingerprint")), t8.b(r8.a(jSONObject2.optString("funding"))), r8.a(jSONObject2.optString("country")), r8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new lf.i(a2, valueOf, aVar, str2);
    }
}
