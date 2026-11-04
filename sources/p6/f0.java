package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class f0 extends y {
    public final IBinder f53248g;
    public final d h;

    public f0(d dVar, int i3, IBinder iBinder, Bundle bundle) {
        super(dVar, i3, bundle);
        this.h = dVar;
        this.f53248g = iBinder;
    }

    @Override
    public final boolean a() {
        IBinder iBinder = this.f53248g;
        try {
            m.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d dVar = this.h;
            String n4 = dVar.n();
            n nVar = dVar.f53231t;
            if (!n4.equals(interfaceDescriptor)) {
                String n10 = dVar.n();
                StringBuilder sb2 = new StringBuilder(n10.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(n10);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface g7 = dVar.g(iBinder);
            if (g7 == null || (!dVar.x(2, 4, g7) && !dVar.x(3, 4, g7))) {
                return false;
            }
            dVar.f53236z = null;
            Bundle j10 = dVar.j();
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.f53295a).onConnected(j10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void b(m6.a aVar) {
        d dVar = this.h;
        n nVar = dVar.f53232u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f53295a).onConnectionFailed(aVar);
        }
        dVar.t(aVar);
    }
}
