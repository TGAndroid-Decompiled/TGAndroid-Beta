package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f45299g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d9.f f45300a;
    public final Context f45301b;
    public final String f45302c;
    public final qa.d d;
    public final s e;
    public c f45303f;

    public v(Context context, String str, qa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f45301b = context;
                this.f45302c = str;
                this.d = dVar;
                this.e = sVar;
                this.f45300a = new Object();
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
            lowerCase = f45299g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f45303f;
        if (cVar != null && (cVar.f45233b != null || !this.e.a())) {
            return this.f45303f;
        }
        t9.b bVar = t9.b.f43373a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f45301b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) x.a(((qa.c) this.d).d());
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
                this.f45303f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f45303f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f45303f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f45303f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f45303f);
        return this.f45303f;
    }

    public final String c() {
        String str;
        d9.f fVar = this.f45300a;
        Context context = this.f45301b;
        synchronized (fVar) {
            try {
                if (fVar.f7564a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    fVar.f7564a = installerPackageName;
                }
                if ("".equals(fVar.f7564a)) {
                    str = null;
                } else {
                    str = fVar.f7564a;
                }
            } finally {
            }
        }
        return str;
    }
}
