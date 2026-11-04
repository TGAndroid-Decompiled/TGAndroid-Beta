package p6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class l0 {
    public static final Object f53283g = new Object();
    public static l0 h;
    public static HandlerThread f53284i;
    public final HashMap f53285a = new HashMap();
    public final Context f53286b;
    public volatile com.google.android.gms.internal.cast.z f53287c;
    public final v6.a d;
    public final long f53288e;
    public final long f53289f;

    public l0(Context context, Looper looper) {
        k0 k0Var = new k0(this);
        this.f53286b = context.getApplicationContext();
        ?? handler = new Handler(looper, k0Var);
        Looper.getMainLooper();
        this.f53287c = handler;
        this.d = v6.a.a();
        this.f53288e = 5000L;
        this.f53289f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f53283g) {
            try {
                HandlerThread handlerThread = f53284i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f53284i = handlerThread2;
                handlerThread2.start();
                return f53284i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m6.a b(i0 i0Var, e0 e0Var, String str) {
        m6.a aVar;
        HashMap hashMap = this.f53285a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var == null) {
                    j0Var = new j0(this, i0Var);
                    j0Var.f53270a.put(e0Var, e0Var);
                    aVar = j0Var.a(str, null);
                    hashMap.put(i0Var, j0Var);
                } else {
                    this.f53287c.removeMessages(0, i0Var);
                    if (!j0Var.f53270a.containsKey(e0Var)) {
                        j0Var.f53270a.put(e0Var, e0Var);
                        int i3 = j0Var.f53271b;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                aVar = j0Var.a(str, null);
                            }
                        } else {
                            e0Var.onServiceConnected(j0Var.f53274f, j0Var.d);
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
                if (j0Var.f53272c) {
                    return m6.a.f19175f;
                }
                if (aVar == null) {
                    aVar = new m6.a(-1, null, null);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        i0 i0Var = new i0(str, str2, z10);
        m.h(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f53285a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var != null) {
                    if (j0Var.f53270a.containsKey(serviceConnection)) {
                        j0Var.f53270a.remove(serviceConnection);
                        if (j0Var.f53270a.isEmpty()) {
                            this.f53287c.sendMessageDelayed(this.f53287c.obtainMessage(0, i0Var), this.f53288e);
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
