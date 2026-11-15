package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
public final class t0 implements ServiceConnection {
    public b f54400a;
    public int f54401b;
    public int f54402c;
    public boolean d;
    public boolean f54403e;
    public final j0 f54404f = new j0(this, 2);
    public final u0 h;

    public t0(u0 u0Var) {
        this.h = u0Var;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        synchronized (this.h.f54412b) {
            try {
                if (!this.d) {
                    return;
                }
                final int i7 = this.f54401b + 1;
                this.f54401b = i7;
                try {
                    iBinder.linkToDeath(new IBinder.DeathRecipient() {
                        @Override
                        public final void binderDied() {
                            int i10 = i7;
                            t0 t0Var = t0.this;
                            t0Var.h.i(t0Var, i10);
                        }
                    }, 0);
                    int i10 = z.f54446b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                        bVar = (b) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f54155a = iBinder;
                        bVar = obj;
                    }
                    this.f54400a = bVar;
                    if (this.f54403e) {
                        try {
                            bVar.b1();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.h.f54412b.notifyAll();
                } catch (RemoteException unused2) {
                }
            } finally {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        int i7;
        synchronized (this.h.f54412b) {
            i7 = this.f54401b;
        }
        this.h.i(this, i7);
    }
}
