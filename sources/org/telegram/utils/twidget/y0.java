package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import org.telegram.messenger.s2;
public final class y0 implements ServiceConnection, IBinder.DeathRecipient {
    public final int f54995a;
    public final boolean f54996b;
    public volatile b f54997c;
    public int d;
    public int f54998e;
    public boolean f54999f;
    public boolean h;
    public boolean f55000n;
    public long f55001r;
    public volatile int f55002s;
    public final long f55003w = SystemClock.uptimeMillis();
    public final j0 f55004x = new j0(this, 2);
    public final z0 f55005y;

    public y0(z0 z0Var, int i7, boolean z10) {
        this.f55005y = z0Var;
        this.f54995a = i7;
        this.f54996b = z10;
    }

    @Override
    public final void binderDied() {
        this.f55005y.u(this, "died");
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        this.f55005y.u(this, "died");
    }

    @Override
    public final void onNullBinding(ComponentName componentName) {
        this.f55005y.u(this, "no binding");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        String str;
        synchronized (this.f55005y.f55008e) {
            if (this.h) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i7 = a0.f54686b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f54685a = iBinder;
                    bVar = obj;
                }
                this.f54997c = bVar;
                if (s2.f26694a) {
                    StringBuilder sb2 = new StringBuilder("process ");
                    sb2.append(this.f54995a);
                    sb2.append(" up in ");
                    sb2.append(SystemClock.uptimeMillis() - this.f55003w);
                    sb2.append(" ms");
                    if (this.f54996b) {
                        str = " (app zygote)";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    Log.d("WidgetEngine", sb2.toString());
                }
                if (this.f55000n) {
                    try {
                        bVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
                this.f55005y.f55008e.notifyAll();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f55005y.u(this, "died");
    }
}
