package y9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f52486g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d5.j f52487a;
    public final Context f52488b;
    public final String f52489c;
    public final sa.d d;
    public final s e;
    public c f52490f;

    public v(Context context, String str, sa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f52488b = context;
                this.f52489c = str;
                this.d = dVar;
                this.e = sVar;
                this.f52487a = new Object();
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
            lowerCase = f52486g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f52490f;
        if (cVar != null && (cVar.f52419b != null || !this.e.a())) {
            return this.f52490f;
        }
        v9.b bVar = v9.b.f50100a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f52488b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f52490f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f52490f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f52490f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f52490f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f52490f);
        return this.f52490f;
    }

    public final String c() {
        String str;
        d5.j jVar = this.f52487a;
        Context context = this.f52488b;
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
