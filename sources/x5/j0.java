package x5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c2.u0;
import java.util.HashMap;
public final class j0 {
    public static final Object f48943g = new Object();
    public static j0 h;
    public static HandlerThread f48944i;
    public final HashMap f48945a = new HashMap();
    public final Context f48946b;
    public volatile u0 f48947c;
    public final d6.a d;
    public final long f48948e;
    public final long f48949f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f48946b = context.getApplicationContext();
        ?? handler = new Handler(looper, i0Var);
        Looper.getMainLooper();
        this.f48947c = handler;
        this.d = d6.a.a();
        this.f48948e = 5000L;
        this.f48949f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f48943g) {
            try {
                HandlerThread handlerThread = f48944i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f48944i = handlerThread2;
                handlerThread2.start();
                return f48944i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u5.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f48945a) {
            try {
                h0 h0Var = (h0) this.f48945a.get(g0Var);
                u5.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f48927a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.f48945a.put(g0Var, h0Var);
                } else {
                    this.f48947c.removeMessages(0, g0Var);
                    if (!h0Var.f48927a.containsKey(c0Var)) {
                        h0Var.f48927a.put(c0Var, c0Var);
                        int i9 = h0Var.f48928b;
                        if (i9 != 1) {
                            if (i9 == 2) {
                                aVar = h0.a(h0Var, str, null);
                            }
                        } else {
                            c0Var.onServiceConnected(h0Var.f48931f, h0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f48929c) {
                    return u5.a.f48098e;
                }
                if (aVar == null) {
                    aVar = new u5.a(-1);
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f48945a) {
            try {
                h0 h0Var = (h0) this.f48945a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f48927a.containsKey(serviceConnection)) {
                        h0Var.f48927a.remove(serviceConnection);
                        if (h0Var.f48927a.isEmpty()) {
                            this.f48947c.sendMessageDelayed(this.f48947c.obtainMessage(0, g0Var), this.f48948e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
