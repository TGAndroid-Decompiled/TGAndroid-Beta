package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class u {
    public static final Pattern f45278g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final ee.v f45279a;
    public final Context f45280b;
    public final String f45281c;
    public final qa.d d;
    public final r e;
    public c f45282f;

    public u(Context context, String str, qa.d dVar, r rVar) {
        if (context != null) {
            if (str != null) {
                this.f45280b = context;
                this.f45281c = str;
                this.d = dVar;
                this.e = rVar;
                this.f45279a = new ee.v(4);
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
            lowerCase = f45278g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f45282f;
        if (cVar != null && (cVar.f45213b != null || !this.e.a())) {
            return this.f45282f;
        }
        t9.b bVar = t9.b.f43352a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f45280b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) w.a(((qa.c) this.d).d());
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
                this.f45282f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f45282f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f45282f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f45282f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f45282f);
        return this.f45282f;
    }

    public final String c() {
        String str;
        ee.v vVar = this.f45279a;
        Context context = this.f45280b;
        synchronized (vVar) {
            try {
                if (vVar.f8202b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    vVar.f8202b = installerPackageName;
                }
                if ("".equals(vVar.f8202b)) {
                    str = null;
                } else {
                    str = vVar.f8202b;
                }
            } finally {
            }
        }
        return str;
    }
}
