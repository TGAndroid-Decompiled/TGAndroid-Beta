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
    public final int f55030a;
    public final boolean f55031b;
    public volatile b f55032c;
    public int d;
    public int f55033e;
    public boolean f55034f;
    public boolean h;
    public boolean f55035n;
    public long f55036r;
    public volatile int f55037s;
    public final long f55038w = SystemClock.uptimeMillis();
    public final j0 f55039x = new j0(this, 2);
    public final z0 f55040y;

    public y0(z0 z0Var, int i7, boolean z10) {
        this.f55040y = z0Var;
        this.f55030a = i7;
        this.f55031b = z10;
    }

    @Override
    public final void binderDied() {
        this.f55040y.u(this, "died");
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        this.f55040y.u(this, "died");
    }

    @Override
    public final void onNullBinding(ComponentName componentName) {
        this.f55040y.u(this, "no binding");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        String str;
        synchronized (this.f55040y.f55043e) {
            if (this.h) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i7 = a0.f54721b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f54720a = iBinder;
                    bVar = obj;
                }
                this.f55032c = bVar;
                if (s2.f26730a) {
                    StringBuilder sb2 = new StringBuilder("process ");
                    sb2.append(this.f55030a);
                    sb2.append(" up in ");
                    sb2.append(SystemClock.uptimeMillis() - this.f55038w);
                    sb2.append(" ms");
                    if (this.f55031b) {
                        str = " (app zygote)";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    Log.d("WidgetEngine", sb2.toString());
                }
                if (this.f55035n) {
                    try {
                        bVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
                this.f55040y.f55043e.notifyAll();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f55040y.u(this, "died");
    }
}
