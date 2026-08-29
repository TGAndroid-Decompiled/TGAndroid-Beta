package z5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c2.v0;
import java.util.HashMap;
public final class j0 {
    public static final Object f50643g = new Object();
    public static j0 h;
    public static HandlerThread f50644i;
    public final HashMap f50645a = new HashMap();
    public final Context f50646b;
    public volatile v0 f50647c;
    public final f6.a d;
    public final long f50648e;
    public final long f50649f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f50646b = context.getApplicationContext();
        ?? handler = new Handler(looper, i0Var);
        Looper.getMainLooper();
        this.f50647c = handler;
        this.d = f6.a.a();
        this.f50648e = 5000L;
        this.f50649f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f50643g) {
            try {
                HandlerThread handlerThread = f50644i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f50644i = handlerThread2;
                handlerThread2.start();
                return f50644i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w5.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f50645a) {
            try {
                h0 h0Var = (h0) this.f50645a.get(g0Var);
                w5.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f50627a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.f50645a.put(g0Var, h0Var);
                } else {
                    this.f50647c.removeMessages(0, g0Var);
                    if (!h0Var.f50627a.containsKey(c0Var)) {
                        h0Var.f50627a.put(c0Var, c0Var);
                        int i10 = h0Var.f50628b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = h0.a(h0Var, str, null);
                            }
                        } else {
                            c0Var.onServiceConnected(h0Var.f50631f, h0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f50629c) {
                    return w5.a.f49757e;
                }
                if (aVar == null) {
                    aVar = new w5.a(-1);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f50645a) {
            try {
                h0 h0Var = (h0) this.f50645a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f50627a.containsKey(serviceConnection)) {
                        h0Var.f50627a.remove(serviceConnection);
                        if (h0Var.f50627a.isEmpty()) {
                            this.f50647c.sendMessageDelayed(this.f50647c.obtainMessage(0, g0Var), this.f50648e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
