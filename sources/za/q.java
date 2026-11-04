package za;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
public final class q {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String f60314a;
    public final String f60315b;
    public final long f60316c;

    public q(long j10, String str, String str2) {
        this.f60314a = str;
        this.f60315b = str2;
        this.f60316c = j10;
    }

    public static String a(long j10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static q b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new q(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
        return new q(0L, str, null);
    }
}
