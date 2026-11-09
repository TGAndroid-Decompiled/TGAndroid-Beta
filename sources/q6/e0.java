package q6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class e0 implements ServiceConnection {
    public final int f53877a;
    public final d f53878b;

    public e0(d dVar, int i7) {
        this.f53878b = dVar;
        this.f53877a = i7;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        d dVar = this.f53878b;
        if (iBinder == null) {
            dVar.z();
            return;
        }
        synchronized (dVar.f53860m) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof z)) {
                    zVar = (z) queryLocalInterface;
                } else {
                    zVar = new z(iBinder);
                }
                dVar.f53861n = zVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar2 = this.f53878b;
        int i7 = this.f53877a;
        dVar2.getClass();
        g0 g0Var = new g0(dVar2, 0, null);
        c0 c0Var = dVar2.f53858k;
        c0Var.sendMessage(c0Var.obtainMessage(7, i7, -1, g0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f53878b;
        synchronized (dVar.f53860m) {
            dVar.f53861n = null;
        }
        d dVar2 = this.f53878b;
        int i7 = this.f53877a;
        c0 c0Var = dVar2.f53858k;
        c0Var.sendMessage(c0Var.obtainMessage(6, i7, 1));
    }
}
