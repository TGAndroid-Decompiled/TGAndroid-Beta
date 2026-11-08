package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
public final class q0 implements ServiceConnection {
    public b f52942a;
    public int f52943b;
    public int f52944c;
    public boolean d;
    public final j0 f52945e = new j0(this, 2);
    public final r0 f52946f;

    public q0(r0 r0Var) {
        this.f52946f = r0Var;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        synchronized (this.f52946f.f52955b) {
            try {
                if (!this.d) {
                    return;
                }
                final int i7 = this.f52943b + 1;
                this.f52943b = i7;
                try {
                    iBinder.linkToDeath(new IBinder.DeathRecipient() {
                        @Override
                        public final void binderDied() {
                            int i10 = i7;
                            q0 q0Var = q0.this;
                            q0Var.f52946f.g(q0Var, i10);
                        }
                    }, 0);
                    int i10 = z.f53007b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                        bVar = (b) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f52749a = iBinder;
                        bVar = obj;
                    }
                    this.f52942a = bVar;
                    if (this.f52946f.h) {
                        try {
                            bVar.b1();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f52946f.f52955b.notifyAll();
                } catch (RemoteException unused2) {
                }
            } finally {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        int i7;
        synchronized (this.f52946f.f52955b) {
            i7 = this.f52943b;
        }
        this.f52946f.g(this, i7);
    }
}
