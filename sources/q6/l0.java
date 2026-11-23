package q6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class l0 {
    public static final Object f56052g = new Object();
    public static l0 h;
    public static HandlerThread f56053i;
    public final HashMap f56054a = new HashMap();
    public final Context f56055b;
    public volatile com.google.android.gms.internal.cast.y f56056c;
    public final w6.a d;
    public final long f56057e;
    public final long f56058f;

    public l0(Context context, Looper looper) {
        k0 k0Var = new k0(this);
        this.f56055b = context.getApplicationContext();
        ?? handler = new Handler(looper, k0Var);
        Looper.getMainLooper();
        this.f56056c = handler;
        this.d = w6.a.a();
        this.f56057e = 5000L;
        this.f56058f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f56052g) {
            try {
                HandlerThread handlerThread = f56053i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f56053i = handlerThread2;
                handlerThread2.start();
                return f56053i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n6.a b(i0 i0Var, e0 e0Var, String str) {
        n6.a aVar;
        HashMap hashMap = this.f56054a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var == null) {
                    j0Var = new j0(this, i0Var);
                    j0Var.f56039a.put(e0Var, e0Var);
                    aVar = j0Var.a(str, null);
                    hashMap.put(i0Var, j0Var);
                } else {
                    this.f56056c.removeMessages(0, i0Var);
                    if (!j0Var.f56039a.containsKey(e0Var)) {
                        j0Var.f56039a.put(e0Var, e0Var);
                        int i7 = j0Var.f56040b;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                aVar = j0Var.a(str, null);
                            }
                        } else {
                            e0Var.onServiceConnected(j0Var.f56043f, j0Var.d);
                        }
                        aVar = null;
                    } else {
                        String i0Var2 = i0Var.toString();
                        StringBuilder sb2 = new StringBuilder(i0Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(i0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                if (j0Var.f56041c) {
                    return n6.a.f21513f;
                }
                if (aVar == null) {
                    aVar = new n6.a(-1, null, null);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        i0 i0Var = new i0(str, str2, z10);
        m.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f56054a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var != null) {
                    if (j0Var.f56039a.containsKey(serviceConnection)) {
                        j0Var.f56039a.remove(serviceConnection);
                        if (j0Var.f56039a.isEmpty()) {
                            this.f56056c.sendMessageDelayed(this.f56056c.obtainMessage(0, i0Var), this.f56057e);
                        }
                    } else {
                        String i0Var2 = i0Var.toString();
                        StringBuilder sb2 = new StringBuilder(i0Var2.length() + 76);
                        sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb2.append(i0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    String i0Var3 = i0Var.toString();
                    StringBuilder sb3 = new StringBuilder(i0Var3.length() + 50);
                    sb3.append("Nonexistent connection status for service config: ");
                    sb3.append(i0Var3);
                    throw new IllegalStateException(sb3.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
