package x5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class d0 extends w {
    public final IBinder f48892g;
    public final g h;

    public d0(g gVar, int i9, IBinder iBinder, Bundle bundle) {
        super(gVar, i9, bundle);
        this.h = gVar;
        this.f48892g = iBinder;
    }

    @Override
    public final void a(u5.a aVar) {
        g gVar = this.h;
        m mVar = gVar.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f48956a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f48892g;
        try {
            l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                String v = gVar.v();
                Log.w("GmsClient", "service descriptor mismatch: " + v + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q10 = gVar.q(iBinder);
            if (q10 == null || (!g.E(gVar, 2, 4, q10) && !g.E(gVar, 3, 4, q10))) {
                return false;
            }
            gVar.K = null;
            Bundle s10 = gVar.s();
            m mVar = gVar.F;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.f48956a).onConnected(s10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
