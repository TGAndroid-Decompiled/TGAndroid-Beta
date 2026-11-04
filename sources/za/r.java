package za;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.o0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class r implements Runnable {
    public final long f60317a;
    public final PowerManager.WakeLock f60318b;
    public final FirebaseMessaging f60319c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e5.r("firebase-iid-executor"));

    public r(FirebaseMessaging firebaseMessaging, long j10) {
        this.f60319c = firebaseMessaging;
        this.f60317a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f7945b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f60318b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f60319c.f7945b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        try {
            if (this.f60319c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e10;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f60318b;
        p r5 = p.r();
        FirebaseMessaging firebaseMessaging = this.f60319c;
        if (r5.t(firebaseMessaging.f7945b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7952k = true;
                }
                if (!firebaseMessaging.f7950i.e()) {
                    firebaseMessaging.f(false);
                    if (p.r().t(firebaseMessaging.f7945b)) {
                        wakeLock.release();
                    }
                } else if (p.r().s(firebaseMessaging.f7945b) && !a()) {
                    o0 o0Var = new o0();
                    o0Var.f6729c = this;
                    o0Var.a();
                    if (p.r().t(firebaseMessaging.f7945b)) {
                        wakeLock.release();
                    }
                } else {
                    if (b()) {
                        firebaseMessaging.f(false);
                    } else {
                        firebaseMessaging.i(this.f60317a);
                    }
                    if (p.r().t(firebaseMessaging.f7945b)) {
                        wakeLock.release();
                    }
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.f(false);
                if (p.r().t(firebaseMessaging.f7945b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (p.r().t(firebaseMessaging.f7945b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
