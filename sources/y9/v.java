package y9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f52544g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d5.j f52545a;
    public final Context f52546b;
    public final String f52547c;
    public final sa.d d;
    public final s e;
    public c f52548f;

    public v(Context context, String str, sa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f52546b = context;
                this.f52547c = str;
                this.d = dVar;
                this.e = sVar;
                this.f52545a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            lowerCase = null;
        } else {
            lowerCase = f52544g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f52548f;
        if (cVar != null && (cVar.f52477b != null || !this.e.a())) {
            return this.f52548f;
        }
        v9.b bVar = v9.b.f50135a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f52546b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) x.a(((sa.c) this.d).d());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            bVar.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f52548f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f52548f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f52548f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f52548f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f52548f);
        return this.f52548f;
    }

    public final String c() {
        String str;
        d5.j jVar = this.f52545a;
        Context context = this.f52546b;
        synchronized (jVar) {
            try {
                if (jVar.f7988a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    jVar.f7988a = installerPackageName;
                }
                if ("".equals(jVar.f7988a)) {
                    str = null;
                } else {
                    str = jVar.f7988a;
                }
            } finally {
            }
        }
        return str;
    }
}
