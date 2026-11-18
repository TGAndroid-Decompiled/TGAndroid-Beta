package q6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class l0 {
    public static final Object f55929g = new Object();
    public static l0 h;
    public static HandlerThread f55930i;
    public final HashMap f55931a = new HashMap();
    public final Context f55932b;
    public volatile com.google.android.gms.internal.cast.y f55933c;
    public final w6.a d;
    public final long f55934e;
    public final long f55935f;

    public l0(Context context, Looper looper) {
        k0 k0Var = new k0(this);
        this.f55932b = context.getApplicationContext();
        ?? handler = new Handler(looper, k0Var);
        Looper.getMainLooper();
        this.f55933c = handler;
        this.d = w6.a.a();
        this.f55934e = 5000L;
        this.f55935f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f55929g) {
            try {
                HandlerThread handlerThread = f55930i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f55930i = handlerThread2;
                handlerThread2.start();
                return f55930i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n6.a b(i0 i0Var, e0 e0Var, String str) {
        n6.a aVar;
        HashMap hashMap = this.f55931a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var == null) {
                    j0Var = new j0(this, i0Var);
                    j0Var.f55916a.put(e0Var, e0Var);
                    aVar = j0Var.a(str, null);
                    hashMap.put(i0Var, j0Var);
                } else {
                    this.f55933c.removeMessages(0, i0Var);
                    if (!j0Var.f55916a.containsKey(e0Var)) {
                        j0Var.f55916a.put(e0Var, e0Var);
                        int i7 = j0Var.f55917b;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                aVar = j0Var.a(str, null);
                            }
                        } else {
                            e0Var.onServiceConnected(j0Var.f55920f, j0Var.d);
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
                if (j0Var.f55918c) {
                    return n6.a.f21417f;
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
        HashMap hashMap = this.f55931a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var != null) {
                    if (j0Var.f55916a.containsKey(serviceConnection)) {
                        j0Var.f55916a.remove(serviceConnection);
                        if (j0Var.f55916a.isEmpty()) {
                            this.f55933c.sendMessageDelayed(this.f55933c.obtainMessage(0, i0Var), this.f55934e);
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
