package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f48997g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final c5.i f48998a;
    public final Context f48999b;
    public final String f49000c;
    public final qa.d d;
    public final s f49001e;
    public c f49002f;

    public v(Context context, String str, qa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f48999b = context;
                this.f49000c = str;
                this.d = dVar;
                this.f49001e = sVar;
                this.f48998a = new Object();
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
            lowerCase = f48997g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f49002f;
        if (cVar != null && (cVar.f48924b != null || !this.f49001e.a())) {
            return this.f49002f;
        }
        t9.b bVar = t9.b.f46936a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f48999b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f49001e.a()) {
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
                this.f49002f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f49002f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f49002f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f49002f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f49002f);
        return this.f49002f;
    }

    public final String c() {
        String str;
        c5.i iVar = this.f48998a;
        Context context = this.f48999b;
        synchronized (iVar) {
            try {
                if (iVar.f4209a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    iVar.f4209a = installerPackageName;
                }
                if ("".equals(iVar.f4209a)) {
                    str = null;
                } else {
                    str = iVar.f4209a;
                }
            } finally {
            }
        }
        return str;
    }
}
