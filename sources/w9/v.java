package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f50522g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final d9.f f50523a;
    public final Context f50524b;
    public final String f50525c;
    public final qa.d d;
    public final s f50526e;
    public c f50527f;

    public v(Context context, String str, qa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f50524b = context;
                this.f50525c = str;
                this.d = dVar;
                this.f50526e = sVar;
                this.f50523a = new Object();
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
            lowerCase = f50522g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f50527f;
        if (cVar != null && (cVar.f50449b != null || !this.f50526e.a())) {
            return this.f50527f;
        }
        t9.b bVar = t9.b.f48476a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f50524b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f50526e.a()) {
            try {
                str = (String) y.a(((qa.c) this.d).d());
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
                this.f50527f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f50527f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f50527f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f50527f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f50527f);
        return this.f50527f;
    }

    public final String c() {
        String str;
        d9.f fVar = this.f50523a;
        Context context = this.f50524b;
        synchronized (fVar) {
            try {
                if (fVar.f8209a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    fVar.f8209a = installerPackageName;
                }
                if ("".equals(fVar.f8209a)) {
                    str = null;
                } else {
                    str = fVar.f8209a;
                }
            } finally {
            }
        }
        return str;
    }
}
