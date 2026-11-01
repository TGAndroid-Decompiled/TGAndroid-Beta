package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f53530g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final f2.a f53531a;
    public final Context f53532b;
    public final String f53533c;
    public final ra.d d;
    public final s e;
    public c f53534f;

    public v(Context context, String str, ra.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f53532b = context;
                this.f53533c = str;
                this.d = dVar;
                this.e = sVar;
                this.f53531a = new Object();
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
            lowerCase = f53530g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f53534f;
        if (cVar != null && (cVar.f53462b != null || !this.e.a())) {
            return this.f53534f;
        }
        u9.c cVar2 = u9.c.f50210a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f53532b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) x.a(((ra.c) this.d).d());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            cVar2.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f53534f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f53534f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f53534f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f53534f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        cVar2.c("Install IDs: " + this.f53534f);
        return this.f53534f;
    }

    public final String c() {
        String str;
        f2.a aVar = this.f53531a;
        Context context = this.f53532b;
        synchronized (aVar) {
            try {
                if (aVar.f6728a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f6728a = installerPackageName;
                }
                if ("".equals(aVar.f6728a)) {
                    str = null;
                } else {
                    str = aVar.f6728a;
                }
            } finally {
            }
        }
        return str;
    }
}
