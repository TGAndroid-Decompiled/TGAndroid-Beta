package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class u {
    public static final Pattern f49755g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d9.l f49756a;
    public final Context f49757b;
    public final String f49758c;
    public final ra.d d;
    public final r e;
    public c f49759f;

    public u(Context context, String str, ra.d dVar, r rVar) {
        if (context != null) {
            if (str != null) {
                this.f49757b = context;
                this.f49758c = str;
                this.d = dVar;
                this.e = rVar;
                this.f49756a = new Object();
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
            lowerCase = f49755g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f49759f;
        if (cVar != null && (cVar.f49690b != null || !this.e.a())) {
            return this.f49759f;
        }
        u9.b bVar = u9.b.f47643a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f49757b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) w.a(((ra.c) this.d).d());
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
                this.f49759f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f49759f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f49759f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f49759f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f49759f);
        return this.f49759f;
    }

    public final String c() {
        String str;
        d9.l lVar = this.f49756a;
        Context context = this.f49757b;
        synchronized (lVar) {
            try {
                if (lVar.f7894a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    lVar.f7894a = installerPackageName;
                }
                if ("".equals(lVar.f7894a)) {
                    str = null;
                } else {
                    str = lVar.f7894a;
                }
            } finally {
            }
        }
        return str;
    }
}
