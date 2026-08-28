package x5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class c0 implements ServiceConnection {
    public final int f48888a;
    public final g f48889b;

    public c0(g gVar, int i9) {
        this.f48889b = gVar;
        this.f48888a = i9;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar;
        g gVar = this.f48889b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f48922x) {
            try {
                g gVar2 = this.f48889b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                    yVar = (y) queryLocalInterface;
                } else {
                    yVar = new y(iBinder);
                }
                gVar2.f48923y = yVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar3 = this.f48889b;
        int i9 = this.f48888a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i9, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f48889b.f48922x) {
            gVar = this.f48889b;
            gVar.f48923y = null;
        }
        int i9 = this.f48888a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i9, 1));
    }
}
