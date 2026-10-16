package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f48348g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final gb.f f48349a;
    public final Context f48350b;
    public final String f48351c;
    public final ra.d d;
    public final s e;
    public c f48352f;

    public v(Context context, String str, ra.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f48350b = context;
                this.f48351c = str;
                this.d = dVar;
                this.e = sVar;
                this.f48349a = new Object();
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
            lowerCase = f48348g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f48352f;
        if (cVar != null && (cVar.f48281b != null || !this.e.a())) {
            return this.f48352f;
        }
        u9.b bVar = u9.b.f46235a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f48350b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f48352f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f48352f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f48352f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f48352f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f48352f);
        return this.f48352f;
    }

    public final String c() {
        String str;
        gb.f fVar = this.f48349a;
        Context context = this.f48350b;
        synchronized (fVar) {
            try {
                if (fVar.f10048a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    fVar.f10048a = installerPackageName;
                }
                if ("".equals(fVar.f10048a)) {
                    str = null;
                } else {
                    str = fVar.f10048a;
                }
            } finally {
            }
        }
        return str;
    }
}
