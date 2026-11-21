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
    public final int f55026a;
    public final boolean f55027b;
    public volatile b f55028c;
    public int d;
    public int f55029e;
    public boolean f55030f;
    public boolean h;
    public boolean f55031n;
    public long f55032r;
    public volatile int f55033s;
    public final long f55034w = SystemClock.uptimeMillis();
    public final j0 f55035x = new j0(this, 2);
    public final z0 f55036y;

    public y0(z0 z0Var, int i7, boolean z10) {
        this.f55036y = z0Var;
        this.f55026a = i7;
        this.f55027b = z10;
    }

    @Override
    public final void binderDied() {
        this.f55036y.u(this, "died");
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        this.f55036y.u(this, "died");
    }

    @Override
    public final void onNullBinding(ComponentName componentName) {
        this.f55036y.u(this, "no binding");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        String str;
        synchronized (this.f55036y.f55039e) {
            if (this.h) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i7 = a0.f54717b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f54716a = iBinder;
                    bVar = obj;
                }
                this.f55028c = bVar;
                if (s2.f26749a) {
                    StringBuilder sb2 = new StringBuilder("process ");
                    sb2.append(this.f55026a);
                    sb2.append(" up in ");
                    sb2.append(SystemClock.uptimeMillis() - this.f55034w);
                    sb2.append(" ms");
                    if (this.f55027b) {
                        str = " (app zygote)";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    Log.d("WidgetEngine", sb2.toString());
                }
                if (this.f55031n) {
                    try {
                        bVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
                this.f55036y.f55039e.notifyAll();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f55036y.u(this, "died");
    }
}
