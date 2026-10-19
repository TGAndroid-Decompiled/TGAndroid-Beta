package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class u {
    public static final Pattern f49734g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final f2.a f49735a;
    public final Context f49736b;
    public final String f49737c;
    public final ra.d d;
    public final r e;
    public c f49738f;

    public u(Context context, String str, ra.d dVar, r rVar) {
        if (context != null) {
            if (str != null) {
                this.f49736b = context;
                this.f49737c = str;
                this.d = dVar;
                this.e = rVar;
                this.f49735a = new Object();
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
            lowerCase = f49734g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f49738f;
        if (cVar != null && (cVar.f49669b != null || !this.e.a())) {
            return this.f49738f;
        }
        u9.b bVar = u9.b.f47621a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f49736b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f49738f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f49738f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f49738f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f49738f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f49738f);
        return this.f49738f;
    }

    public final String c() {
        String str;
        f2.a aVar = this.f49735a;
        Context context = this.f49736b;
        synchronized (aVar) {
            try {
                if (aVar.f10279a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f10279a = installerPackageName;
                }
                if ("".equals(aVar.f10279a)) {
                    str = null;
                } else {
                    str = aVar.f10279a;
                }
            } finally {
            }
        }
        return str;
    }
}
