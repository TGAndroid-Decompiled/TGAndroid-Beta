package y5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class c0 implements ServiceConnection {

    public final int f49605a;

    public final g f49606b;

    public c0(g gVar, int i10) {
        this.f49606b = gVar;
        this.f49605a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar = this.f49606b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f49639x) {
            try {
                g gVar2 = this.f49606b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gVar2.f49640y = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new y(iBinder) : (y) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar3 = this.f49606b;
        int i10 = this.f49605a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f49606b.f49639x) {
            gVar = this.f49606b;
            gVar.f49640y = null;
        }
        int i10 = this.f49605a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
