package x9;

import org.json.JSONObject;
public abstract class l {
    public static final ka.c f46008a;

    static {
        ka.e eVar = new ka.e();
        a aVar = a.f45980a;
        eVar.a(l.class, aVar);
        eVar.a(b.class, aVar);
        f46008a = new ka.c(eVar, 0);
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
