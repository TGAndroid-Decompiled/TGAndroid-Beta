package p6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class e0 implements ServiceConnection {
    public final int f53241a;
    public final d f53242b;

    public e0(d dVar, int i3) {
        this.f53242b = dVar;
        this.f53241a = i3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        d dVar = this.f53242b;
        if (iBinder == null) {
            dVar.y();
            return;
        }
        synchronized (dVar.f53224m) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof z)) {
                    zVar = (z) queryLocalInterface;
                } else {
                    zVar = new z(iBinder);
                }
                dVar.f53225n = zVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar2 = this.f53242b;
        int i3 = this.f53241a;
        dVar2.getClass();
        g0 g0Var = new g0(dVar2, 0, null);
        c0 c0Var = dVar2.f53222k;
        c0Var.sendMessage(c0Var.obtainMessage(7, i3, -1, g0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f53242b;
        synchronized (dVar.f53224m) {
            dVar.f53225n = null;
        }
        d dVar2 = this.f53242b;
        int i3 = this.f53241a;
        c0 c0Var = dVar2.f53222k;
        c0Var.sendMessage(c0Var.obtainMessage(6, i3, 1));
    }
}
