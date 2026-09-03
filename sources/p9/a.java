package p9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.z0;
import java.util.HashMap;
import l7.w0;
import org.json.JSONObject;
import ra.m;
public final class a implements m {
    public final String f41083a;

    public a(String str, cb.b bVar) {
        if (str != null) {
            this.f41083a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public static void a(w0 w0Var, d dVar) {
        String str = dVar.f41088a;
        if (str != null) {
            w0Var.w("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        w0Var.w("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        w0Var.w("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        w0Var.w("Accept", "application/json");
        String str2 = dVar.f41089b;
        if (str2 != null) {
            w0Var.w("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f41090c;
        if (str3 != null) {
            w0Var.w("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            w0Var.w("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f7359a;
        if (str5 != null) {
            w0Var.w("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f41092g);
        hashMap.put("source", Integer.toString(dVar.f41093i));
        String str = dVar.f41091f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(z0 z0Var) {
        int i10 = z0Var.f3421b;
        f9.b bVar = f9.b.f6095a;
        bVar.c("Settings response code was: " + i10);
        String str = this.f41083a;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = z0Var.f3422c;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar.d("Failed to parse settings JSON from " + str, e);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object u2() {
        throw new RuntimeException(this.f41083a);
    }

    public a(String str) {
        this.f41083a = str;
    }
}
