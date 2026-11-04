package za;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import org.telegram.ui.ActionBar.h4;
public final class w implements Runnable {
    public static final Object f60335f = new Object();
    public static Boolean h;
    public static Boolean f60336n;
    public final Context f60337a;
    public final h4 f60338b;
    public final PowerManager.WakeLock f60339c;
    public final u d;
    public final long f60340e;

    public w(u uVar, Context context, h4 h4Var, long j10) {
        this.d = uVar;
        this.f60337a = context;
        this.f60340e = j10;
        this.f60338b = h4Var;
        this.f60339c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f60335f) {
            try {
                Boolean bool = f60336n;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f60336n = valueOf;
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
        synchronized (f60335f) {
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

    public final synchronized boolean e() {
        NetworkInfo networkInfo;
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f60337a.getSystemService("connectivity");
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
        u uVar = this.d;
        Context context = this.f60337a;
        boolean c2 = c(context);
        PowerManager.WakeLock wakeLock = this.f60339c;
        if (c2) {
            wakeLock.acquire(e.f60287a);
        }
        try {
            try {
                try {
                    uVar.c(true);
                    if (!this.f60338b.e()) {
                        uVar.c(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else if (a(context) && !e()) {
                        new v(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else {
                        if (uVar.d()) {
                            uVar.c(false);
                        } else {
                            uVar.e(this.f60340e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    uVar.c(false);
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
