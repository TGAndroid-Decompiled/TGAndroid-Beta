package z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class v {
    public static final Pattern f60248g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final com.google.android.gms.internal.clearcut.e f60249a;
    public final Context f60250b;
    public final String f60251c;
    public final ua.e d;
    public final s f60252e;
    public c f60253f;

    public v(Context context, String str, ua.e eVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f60250b = context;
                this.f60251c = str;
                this.d = eVar;
                this.f60252e = sVar;
                this.f60249a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = f60248g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final z9.u b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: z9.v.b(boolean):z9.u");
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f60253f;
        if (cVar != null && (cVar.f60168b != null || !this.f60252e.a())) {
            return this.f60253f;
        }
        w9.c cVar2 = w9.c.f57426a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f60250b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.f60252e.a()) {
            u b10 = b(false);
            cVar2.c("Fetched Firebase Installation ID: " + b10.f60246a);
            if (b10.f60246a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new u(str, null);
            }
            if (Objects.equals(b10.f60246a, string)) {
                this.f60253f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b10.f60246a, b10.f60247b);
            } else {
                this.f60253f = new c(a(b10.f60246a, sharedPreferences), b10.f60246a, b10.f60247b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f60253f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f60253f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        cVar2.c("Install IDs: " + this.f60253f);
        return this.f60253f;
    }

    public final String d() {
        String str;
        com.google.android.gms.internal.clearcut.e eVar = this.f60249a;
        Context context = this.f60250b;
        synchronized (eVar) {
            try {
                if (eVar.f7212a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    eVar.f7212a = installerPackageName;
                }
                if ("".equals(eVar.f7212a)) {
                    str = null;
                } else {
                    str = eVar.f7212a;
                }
            } finally {
            }
        }
        return str;
    }
}
