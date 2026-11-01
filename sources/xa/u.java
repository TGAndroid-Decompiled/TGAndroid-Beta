package xa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import org.telegram.ui.ActionBar.p4;
public final class u implements Runnable {
    public static final Object f53596f = new Object();
    public static Boolean h;
    public static Boolean f53597n;
    public final Context f53598a;
    public final p4 f53599b;
    public final PowerManager.WakeLock f53600c;
    public final s d;
    public final long e;

    public u(s sVar, Context context, p4 p4Var, long j10) {
        this.d = sVar;
        this.f53598a = context;
        this.e = j10;
        this.f53599b = p4Var;
        this.f53600c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f53596f) {
            try {
                Boolean bool = f53597n;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f53597n = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f53596f) {
            try {
                Boolean bool = h;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f53598a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z10 = true;
                }
            }
            z10 = false;
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override
    public final void run() {
        s sVar = this.d;
        Context context = this.f53598a;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f53600c;
        if (c10) {
            wakeLock.acquire(e.f53555a);
        }
        try {
            try {
                try {
                    sVar.f(true);
                    if (!this.f53599b.e()) {
                        sVar.f(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else if (a(context) && !d()) {
                        new t(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else {
                        if (sVar.g()) {
                            sVar.f(false);
                        } else {
                            sVar.h(this.e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    sVar.f(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
