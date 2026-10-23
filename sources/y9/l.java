package y9;

import ki.t1;
import org.json.JSONObject;
public abstract class l {
    public static final t1 f50117a;

    static {
        la.d dVar = new la.d();
        a aVar = a.f50089a;
        dVar.a(l.class, aVar);
        dVar.a(b.class, aVar);
        f50117a = new t1(dVar, 4);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j10 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j10);
    }
}
