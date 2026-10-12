package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f48349g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final gb.e f48350a;
    public final Context f48351b;
    public final String f48352c;
    public final ra.d d;
    public final s e;
    public c f48353f;

    public v(Context context, String str, ra.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f48351b = context;
                this.f48352c = str;
                this.d = dVar;
                this.e = sVar;
                this.f48350a = new Object();
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
            lowerCase = f48349g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f48353f;
        if (cVar != null && (cVar.f48282b != null || !this.e.a())) {
            return this.f48353f;
        }
        u9.b bVar = u9.b.f46235a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f48351b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) x.a(((ra.c) this.d).d());
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
                this.f48353f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f48353f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f48353f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f48353f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f48353f);
        return this.f48353f;
    }

    public final String c() {
        String str;
        gb.e eVar = this.f48350a;
        Context context = this.f48351b;
        synchronized (eVar) {
            try {
                if (eVar.f10044a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    eVar.f10044a = installerPackageName;
                }
                if ("".equals(eVar.f10044a)) {
                    str = null;
                } else {
                    str = eVar.f10044a;
                }
            } finally {
            }
        }
        return str;
    }
}
