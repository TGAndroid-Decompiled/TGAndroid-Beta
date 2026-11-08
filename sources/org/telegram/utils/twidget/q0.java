package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
public final class q0 implements ServiceConnection {
    public b f52943a;
    public int f52944b;
    public int f52945c;
    public boolean d;
    public boolean f52946e;
    public final j0 f52947f = new j0(this, 2);
    public final r0 h;

    public q0(r0 r0Var) {
        this.h = r0Var;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        synchronized (this.h.f52956b) {
            try {
                if (!this.d) {
                    return;
                }
                final int i7 = this.f52944b + 1;
                this.f52944b = i7;
                try {
                    iBinder.linkToDeath(new IBinder.DeathRecipient() {
                        @Override
                        public final void binderDied() {
                            int i10 = i7;
                            q0 q0Var = q0.this;
                            q0Var.h.i(q0Var, i10);
                        }
                    }, 0);
                    int i10 = z.f53008b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                        bVar = (b) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f52749a = iBinder;
                        bVar = obj;
                    }
                    this.f52943a = bVar;
                    if (this.f52946e) {
                        try {
                            bVar.b1();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.h.f52956b.notifyAll();
                } catch (RemoteException unused2) {
                }
            } finally {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        int i7;
        synchronized (this.h.f52956b) {
            i7 = this.f52944b;
        }
        this.h.i(this, i7);
    }
}
