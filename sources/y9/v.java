package y9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f52483g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d5.j f52484a;
    public final Context f52485b;
    public final String f52486c;
    public final sa.d d;
    public final s e;
    public c f52487f;

    public v(Context context, String str, sa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f52485b = context;
                this.f52486c = str;
                this.d = dVar;
                this.e = sVar;
                this.f52484a = new Object();
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
            lowerCase = f52483g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f52487f;
        if (cVar != null && (cVar.f52416b != null || !this.e.a())) {
            return this.f52487f;
        }
        v9.b bVar = v9.b.f50097a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f52485b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f52487f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f52487f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f52487f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f52487f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f52487f);
        return this.f52487f;
    }

    public final String c() {
        String str;
        d5.j jVar = this.f52484a;
        Context context = this.f52485b;
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
