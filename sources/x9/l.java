package x9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class l implements Runnable {
    public final int f53480a;
    public final long f53481b;
    public final Object f53482c;
    public final Object d;
    public final Object e;

    public l(FirebaseMessaging firebaseMessaging, long j10) {
        this.f53480a = 1;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.s("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.f53481b = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f5591b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f53482c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).f5591b.getSystemService("connectivity");
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

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public final void run() {
        switch (this.f53480a) {
            case 0:
                n nVar = (n) this.e;
                r rVar = nVar.f53496n;
                if (rVar == null || !rVar.e.get()) {
                    long j10 = this.f53481b / 1000;
                    String e = nVar.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    j2.f fVar = nVar.f53495m;
                    Throwable th2 = (Throwable) this.f53482c;
                    Thread thread = (Thread) this.d;
                    fVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    fVar.u(th2, thread, e, "error", j10, false);
                    return;
                }
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f53482c;
                xa.n D = xa.n.D();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (D.I(firebaseMessaging.f5591b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f5596j = true;
                        }
                        if (!firebaseMessaging.f5595i.e()) {
                            firebaseMessaging.e(false);
                            if (!xa.n.D().I(firebaseMessaging.f5591b)) {
                                return;
                            }
                        } else if (xa.n.D().H(firebaseMessaging.f5591b) && !a()) {
                            androidx.mediarouter.app.f fVar2 = new androidx.mediarouter.app.f();
                            fVar2.f1774b = this;
                            fVar2.a();
                            if (!xa.n.D().I(firebaseMessaging.f5591b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.f53481b);
                            }
                            if (!xa.n.D().I(firebaseMessaging.f5591b)) {
                                return;
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!xa.n.D().I(firebaseMessaging.f5591b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th3) {
                    if (xa.n.D().I(firebaseMessaging.f5591b)) {
                        wakeLock.release();
                    }
                    throw th3;
                }
        }
    }

    public l(n nVar, long j10, Throwable th2, Thread thread) {
        this.f53480a = 0;
        this.e = nVar;
        this.f53481b = j10;
        this.f53482c = th2;
        this.d = thread;
    }
}
