package p6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class j0 implements ServiceConnection {
    public final HashMap f53270a = new HashMap();
    public int f53271b = 2;
    public boolean f53272c;
    public IBinder d;
    public final i0 f53273e;
    public ComponentName f53274f;
    public final l0 h;

    public j0(l0 l0Var, i0 i0Var) {
        this.h = l0Var;
        this.f53273e = i0Var;
    }

    public final m6.a a(String str, Executor executor) {
        try {
            Intent a10 = b0.a(this.h.f53286b, this.f53273e);
            this.f53271b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(w6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                l0 l0Var = this.h;
                v6.a aVar = l0Var.d;
                Context context = l0Var.f53286b;
                i0 i0Var = this.f53273e;
                try {
                    boolean c2 = aVar.c(context, str, a10, this, 4225, executor);
                    this.f53272c = c2;
                    if (c2) {
                        l0Var.f53287c.sendMessageDelayed(l0Var.f53287c.obtainMessage(1, i0Var), l0Var.f53289f);
                        m6.a aVar2 = m6.a.f19175f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return aVar2;
                    }
                    this.f53271b = 2;
                    try {
                        l0Var.d.b(l0Var.f53286b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    m6.a aVar3 = new m6.a(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar3;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (a0 e10) {
            return e10.f53210a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l0 l0Var = this.h;
        synchronized (l0Var.f53285a) {
            try {
                l0Var.f53287c.removeMessages(1, this.f53273e);
                this.d = iBinder;
                this.f53274f = componentName;
                for (ServiceConnection serviceConnection : this.f53270a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f53271b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        l0 l0Var = this.h;
        synchronized (l0Var.f53285a) {
            try {
                l0Var.f53287c.removeMessages(1, this.f53273e);
                this.d = null;
                this.f53274f = componentName;
                for (ServiceConnection serviceConnection : this.f53270a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f53271b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
