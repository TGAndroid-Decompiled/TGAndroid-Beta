package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class u {
    public static final Pattern f50415g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d9.f f50416a;
    public final Context f50417b;
    public final String f50418c;
    public final qa.d d;
    public final r f50419e;
    public c f50420f;

    public u(Context context, String str, qa.d dVar, r rVar) {
        if (context != null) {
            if (str != null) {
                this.f50417b = context;
                this.f50418c = str;
                this.d = dVar;
                this.f50419e = rVar;
                this.f50416a = new Object();
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
            lowerCase = f50415g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f50420f;
        if (cVar != null && (cVar.f50343b != null || !this.f50419e.a())) {
            return this.f50420f;
        }
        t9.b bVar = t9.b.f48369a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f50417b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f50419e.a()) {
            try {
                str = (String) x.a(((qa.c) this.d).d());
            } catch (Exception e7) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e7);
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
                this.f50420f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f50420f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f50420f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f50420f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f50420f);
        return this.f50420f;
    }

    public final String c() {
        String str;
        d9.f fVar = this.f50416a;
        Context context = this.f50417b;
        synchronized (fVar) {
            try {
                if (fVar.f8211a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    fVar.f8211a = installerPackageName;
                }
                if ("".equals(fVar.f8211a)) {
                    str = null;
                } else {
                    str = fVar.f8211a;
                }
            } finally {
            }
        }
        return str;
    }
}
