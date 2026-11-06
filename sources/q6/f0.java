package q6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class f0 extends y {
    public final IBinder f53778g;
    public final d h;

    public f0(d dVar, int i7, IBinder iBinder, Bundle bundle) {
        super(dVar, i7, bundle);
        this.h = dVar;
        this.f53778g = iBinder;
    }

    @Override
    public final boolean a() {
        IBinder iBinder = this.f53778g;
        try {
            m.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d dVar = this.h;
            String o4 = dVar.o();
            n nVar = dVar.f53761t;
            if (!o4.equals(interfaceDescriptor)) {
                String o10 = dVar.o();
                StringBuilder sb2 = new StringBuilder(o10.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(o10);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface i7 = dVar.i(iBinder);
            if (i7 == null || (!dVar.y(2, 4, i7) && !dVar.y(3, 4, i7))) {
                return false;
            }
            dVar.f53766z = null;
            Bundle l10 = dVar.l();
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.f53825a).onConnected(l10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void b(n6.a aVar) {
        d dVar = this.h;
        n nVar = dVar.f53762u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f53825a).onConnectionFailed(aVar);
        }
        dVar.u(aVar);
    }
}
