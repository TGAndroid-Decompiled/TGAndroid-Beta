package y5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import c2.t0;
import java.util.HashMap;

public final class j0 {

    public static final Object f49660g = new Object();
    public static j0 h;

    public static HandlerThread f49661i;

    public final HashMap f49662a = new HashMap();

    public final Context f49663b;

    public volatile t0 f49664c;
    public final e6.a d;

    public final long f49665e;

    public final long f49666f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f49663b = context.getApplicationContext();
        t0 t0Var = new t0(looper, i0Var);
        Looper.getMainLooper();
        this.f49664c = t0Var;
        this.d = e6.a.a();
        this.f49665e = 5000L;
        this.f49666f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f49660g) {
            try {
                HandlerThread handlerThread = f49661i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f49661i = handlerThread2;
                handlerThread2.start();
                return f49661i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v5.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f49662a) {
            try {
                h0 h0Var = (h0) this.f49662a.get(g0Var);
                v5.a aVarA = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f49644a.put(c0Var, c0Var);
                    aVarA = h0.a(h0Var, str, null);
                    this.f49662a.put(g0Var, h0Var);
                } else {
                    this.f49664c.removeMessages(0, g0Var);
                    if (h0Var.f49644a.containsKey(c0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                    h0Var.f49644a.put(c0Var, c0Var);
                    int i10 = h0Var.f49645b;
                    if (i10 == 1) {
                        c0Var.onServiceConnected(h0Var.f49648f, h0Var.d);
                    } else if (i10 == 2) {
                        aVarA = h0.a(h0Var, str, null);
                    }
                }
                if (h0Var.f49646c) {
                    return v5.a.f48783e;
                }
                if (aVarA == null) {
                    aVarA = new v5.a(-1);
                }
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f49662a) {
            try {
                h0 h0Var = (h0) this.f49662a.get(g0Var);
                if (h0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
                if (!h0Var.f49644a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                }
                h0Var.f49644a.remove(serviceConnection);
                if (h0Var.f49644a.isEmpty()) {
                    this.f49664c.sendMessageDelayed(this.f49664c.obtainMessage(0, g0Var), this.f49665e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
