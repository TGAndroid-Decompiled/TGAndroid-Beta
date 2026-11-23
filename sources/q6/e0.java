package q6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class e0 implements ServiceConnection {
    public final int f56010a;
    public final d f56011b;

    public e0(d dVar, int i7) {
        this.f56011b = dVar;
        this.f56010a = i7;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        d dVar = this.f56011b;
        if (iBinder == null) {
            dVar.z();
            return;
        }
        synchronized (dVar.f55993m) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof z)) {
                    zVar = (z) queryLocalInterface;
                } else {
                    zVar = new z(iBinder);
                }
                dVar.f55994n = zVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar2 = this.f56011b;
        int i7 = this.f56010a;
        dVar2.getClass();
        g0 g0Var = new g0(dVar2, 0, null);
        c0 c0Var = dVar2.f55991k;
        c0Var.sendMessage(c0Var.obtainMessage(7, i7, -1, g0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f56011b;
        synchronized (dVar.f55993m) {
            dVar.f55994n = null;
        }
        d dVar2 = this.f56011b;
        int i7 = this.f56010a;
        c0 c0Var = dVar2.f55991k;
        c0Var.sendMessage(c0Var.obtainMessage(6, i7, 1));
    }
}
