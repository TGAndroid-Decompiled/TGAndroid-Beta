package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class u {
    public static final Pattern f48451g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final c5.i f48452a;
    public final Context f48453b;
    public final String f48454c;
    public final qa.d d;
    public final r f48455e;
    public c f48456f;

    public u(Context context, String str, qa.d dVar, r rVar) {
        if (context != null) {
            if (str != null) {
                this.f48453b = context;
                this.f48454c = str;
                this.d = dVar;
                this.f48455e = rVar;
                this.f48452a = new Object();
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
            lowerCase = f48451g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f48456f;
        if (cVar != null && (cVar.f48379b != null || !this.f48455e.a())) {
            return this.f48456f;
        }
        t9.b bVar = t9.b.f46479a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f48453b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f48455e.a()) {
            try {
                str = (String) w.a(((qa.c) this.d).d());
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
                this.f48456f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f48456f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f48456f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f48456f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f48456f);
        return this.f48456f;
    }

    public final String c() {
        String str;
        c5.i iVar = this.f48452a;
        Context context = this.f48453b;
        synchronized (iVar) {
            try {
                if (iVar.f4403a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    iVar.f4403a = installerPackageName;
                }
                if ("".equals(iVar.f4403a)) {
                    str = null;
                } else {
                    str = iVar.f4403a;
                }
            } finally {
            }
        }
        return str;
    }
}
