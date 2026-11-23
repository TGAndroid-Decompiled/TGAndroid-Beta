package q6;

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
    public final HashMap f56039a = new HashMap();
    public int f56040b = 2;
    public boolean f56041c;
    public IBinder d;
    public final i0 f56042e;
    public ComponentName f56043f;
    public final l0 h;

    public j0(l0 l0Var, i0 i0Var) {
        this.h = l0Var;
        this.f56042e = i0Var;
    }

    public final n6.a a(String str, Executor executor) {
        try {
            Intent a10 = b0.a(this.h.f56055b, this.f56042e);
            this.f56040b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(x6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                l0 l0Var = this.h;
                w6.a aVar = l0Var.d;
                Context context = l0Var.f56055b;
                i0 i0Var = this.f56042e;
                try {
                    boolean c10 = aVar.c(context, str, a10, this, 4225, executor);
                    this.f56041c = c10;
                    if (c10) {
                        l0Var.f56056c.sendMessageDelayed(l0Var.f56056c.obtainMessage(1, i0Var), l0Var.f56058f);
                        n6.a aVar2 = n6.a.f21513f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return aVar2;
                    }
                    this.f56040b = 2;
                    try {
                        l0Var.d.b(l0Var.f56055b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    n6.a aVar3 = new n6.a(16, null, null);
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
            return e10.f55979a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l0 l0Var = this.h;
        synchronized (l0Var.f56054a) {
            try {
                l0Var.f56056c.removeMessages(1, this.f56042e);
                this.d = iBinder;
                this.f56043f = componentName;
                for (ServiceConnection serviceConnection : this.f56039a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f56040b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        l0 l0Var = this.h;
        synchronized (l0Var.f56054a) {
            try {
                l0Var.f56056c.removeMessages(1, this.f56042e);
                this.d = null;
                this.f56043f = componentName;
                for (ServiceConnection serviceConnection : this.f56039a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f56040b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
