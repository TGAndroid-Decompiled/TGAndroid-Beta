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
    public final int f54985a;
    public final boolean f54986b;
    public volatile b f54987c;
    public int d;
    public int f54988e;
    public boolean f54989f;
    public boolean h;
    public boolean f54990n;
    public long f54991r;
    public volatile int f54992s;
    public final long f54993w = SystemClock.uptimeMillis();
    public final j0 f54994x = new j0(this, 2);
    public final z0 f54995y;

    public y0(z0 z0Var, int i7, boolean z10) {
        this.f54995y = z0Var;
        this.f54985a = i7;
        this.f54986b = z10;
    }

    @Override
    public final void binderDied() {
        this.f54995y.u(this, "died");
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        this.f54995y.u(this, "died");
    }

    @Override
    public final void onNullBinding(ComponentName componentName) {
        this.f54995y.u(this, "no binding");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        String str;
        synchronized (this.f54995y.f54998e) {
            if (this.h) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i7 = a0.f54676b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f54675a = iBinder;
                    bVar = obj;
                }
                this.f54987c = bVar;
                if (s2.f26721a) {
                    StringBuilder sb2 = new StringBuilder("process ");
                    sb2.append(this.f54985a);
                    sb2.append(" up in ");
                    sb2.append(SystemClock.uptimeMillis() - this.f54993w);
                    sb2.append(" ms");
                    if (this.f54986b) {
                        str = " (app zygote)";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    Log.d("WidgetEngine", sb2.toString());
                }
                if (this.f54990n) {
                    try {
                        bVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
                this.f54995y.f54998e.notifyAll();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f54995y.u(this, "died");
    }
}
