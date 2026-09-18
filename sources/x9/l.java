package x9;

import org.json.JSONObject;
public abstract class l {
    public static final ka.c f45981a;

    static {
        ka.e eVar = new ka.e();
        a aVar = a.f45953a;
        eVar.m(l.class, aVar);
        eVar.m(b.class, aVar);
        f45981a = new ka.c(eVar, 0);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j3 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j3);
    }
}
