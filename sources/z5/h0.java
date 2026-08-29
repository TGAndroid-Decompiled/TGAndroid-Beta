package z5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class h0 implements ServiceConnection {
    public final HashMap f50627a = new HashMap();
    public int f50628b = 2;
    public boolean f50629c;
    public IBinder d;
    public final g0 f50630e;
    public ComponentName f50631f;
    public final j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.f50630e = g0Var;
    }

    public static w5.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a2 = h0Var.f50630e.a(h0Var.h.f50646b);
            h0Var.f50628b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(g6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean c3 = j0Var.d.c(j0Var.f50646b, str, a2, h0Var, 4225, executor);
                h0Var.f50629c = c3;
                if (c3) {
                    h0Var.h.f50647c.sendMessageDelayed(h0Var.h.f50647c.obtainMessage(1, h0Var.f50630e), h0Var.h.f50649f);
                    w5.a aVar = w5.a.f49757e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                h0Var.f50628b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.f50646b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                w5.a aVar2 = new w5.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (z e10) {
            return e10.f50693a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f50645a) {
            try {
                this.h.f50647c.removeMessages(1, this.f50630e);
                this.d = iBinder;
                this.f50631f = componentName;
                for (ServiceConnection serviceConnection : this.f50627a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f50628b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f50645a) {
            try {
                this.h.f50647c.removeMessages(1, this.f50630e);
                this.d = null;
                this.f50631f = componentName;
                for (ServiceConnection serviceConnection : this.f50627a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f50628b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
