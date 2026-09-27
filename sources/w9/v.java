package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f45307g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final ee.v f45308a;
    public final Context f45309b;
    public final String f45310c;
    public final qa.d d;
    public final s e;
    public c f45311f;

    public v(Context context, String str, qa.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f45309b = context;
                this.f45310c = str;
                this.d = dVar;
                this.e = sVar;
                this.f45308a = new ee.v(4);
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
            lowerCase = f45307g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f45311f;
        if (cVar != null && (cVar.f45241b != null || !this.e.a())) {
            return this.f45311f;
        }
        t9.b bVar = t9.b.f43383a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f45309b.getSharedPreferences("com.google.firebase.crashlytics", 0);
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
                this.f45311f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f45311f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f45311f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f45311f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f45311f);
        return this.f45311f;
    }

    public final String c() {
        String str;
        ee.v vVar = this.f45308a;
        Context context = this.f45309b;
        synchronized (vVar) {
            try {
                if (vVar.f8186b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    vVar.f8186b = installerPackageName;
                }
                if ("".equals(vVar.f8186b)) {
                    str = null;
                } else {
                    str = vVar.f8186b;
                }
            } finally {
            }
        }
        return str;
    }
}
