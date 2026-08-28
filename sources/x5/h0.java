package x5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class h0 implements ServiceConnection {
    public final HashMap f48927a = new HashMap();
    public int f48928b = 2;
    public boolean f48929c;
    public IBinder d;
    public final g0 f48930e;
    public ComponentName f48931f;
    public final j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.f48930e = g0Var;
    }

    public static u5.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a2 = h0Var.f48930e.a(h0Var.h.f48946b);
            h0Var.f48928b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(e6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean c10 = j0Var.d.c(j0Var.f48946b, str, a2, h0Var, 4225, executor);
                h0Var.f48929c = c10;
                if (c10) {
                    h0Var.h.f48947c.sendMessageDelayed(h0Var.h.f48947c.obtainMessage(1, h0Var.f48930e), h0Var.h.f48949f);
                    u5.a aVar = u5.a.f48098e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                h0Var.f48928b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.f48946b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                u5.a aVar2 = new u5.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (z e10) {
            return e10.f48993a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f48945a) {
            try {
                this.h.f48947c.removeMessages(1, this.f48930e);
                this.d = iBinder;
                this.f48931f = componentName;
                for (ServiceConnection serviceConnection : this.f48927a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f48928b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f48945a) {
            try {
                this.h.f48947c.removeMessages(1, this.f48930e);
                this.d = null;
                this.f48931f = componentName;
                for (ServiceConnection serviceConnection : this.f48927a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f48928b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
