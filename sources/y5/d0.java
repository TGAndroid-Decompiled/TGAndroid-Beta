package y5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

public final class d0 extends w {

    public final IBinder f49609g;
    public final g h;

    public d0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.f49609g = iBinder;
    }

    @Override
    public final void a(v5.a aVar) {
        g gVar = this.h;
        m mVar = gVar.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f49673a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f49609g;
        try {
            l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + gVar.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceQ = gVar.q(iBinder);
            if (iInterfaceQ == null || !(g.E(gVar, 2, 4, iInterfaceQ) || g.E(gVar, 3, 4, iInterfaceQ))) {
                return false;
            }
            gVar.K = null;
            Bundle bundleS = gVar.s();
            m mVar = gVar.F;
            if (mVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) mVar.f49673a).onConnected(bundleS);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
