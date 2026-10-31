package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f53512g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final f2.a f53513a;
    public final Context f53514b;
    public final String f53515c;
    public final ra.d d;
    public final s e;
    public c f53516f;

    public v(Context context, String str, ra.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f53514b = context;
                this.f53515c = str;
                this.d = dVar;
                this.e = sVar;
                this.f53513a = new Object();
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
            lowerCase = f53512g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f53516f;
        if (cVar != null && (cVar.f53444b != null || !this.e.a())) {
            return this.f53516f;
        }
        u9.c cVar2 = u9.c.f50196a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f53514b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f53516f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f53516f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f53516f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f53516f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        cVar2.c("Install IDs: " + this.f53516f);
        return this.f53516f;
    }

    public final String c() {
        String str;
        f2.a aVar = this.f53513a;
        Context context = this.f53514b;
        synchronized (aVar) {
            try {
                if (aVar.f6727a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f6727a = installerPackageName;
                }
                if ("".equals(aVar.f6727a)) {
                    str = null;
                } else {
                    str = aVar.f6727a;
                }
            } finally {
            }
        }
        return str;
    }
}
