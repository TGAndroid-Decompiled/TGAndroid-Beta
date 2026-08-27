package y5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class h0 implements ServiceConnection {

    public final HashMap f49644a = new HashMap();

    public int f49645b = 2;

    public boolean f49646c;
    public IBinder d;

    public final g0 f49647e;

    public ComponentName f49648f;
    public final j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.f49647e = g0Var;
    }

    public static v5.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent intentA = h0Var.f49647e.a(h0Var.h.f49663b);
            h0Var.f49645b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(f6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean zC = j0Var.d.c(j0Var.f49663b, str, intentA, h0Var, 4225, executor);
                h0Var.f49646c = zC;
                if (zC) {
                    h0Var.h.f49664c.sendMessageDelayed(h0Var.h.f49664c.obtainMessage(1, h0Var.f49647e), h0Var.h.f49666f);
                    return v5.a.f48783e;
                }
                h0Var.f49645b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.f49663b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                return new v5.a(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (z e9) {
            return e9.f49710a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f49662a) {
            try {
                this.h.f49664c.removeMessages(1, this.f49647e);
                this.d = iBinder;
                this.f49648f = componentName;
                Iterator it = this.f49644a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f49645b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f49662a) {
            try {
                this.h.f49664c.removeMessages(1, this.f49647e);
                this.d = null;
                this.f49648f = componentName;
                Iterator it = this.f49644a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f49645b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
