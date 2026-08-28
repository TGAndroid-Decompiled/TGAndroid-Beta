package x5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends a7.a {
    public g f48885b;
    public final int f48886c;

    public b0(g gVar, int i9) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 11);
        this.f48885b = gVar;
        this.f48886c = i9;
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        n nVar;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                f0 f0Var = (f0) w6.a.a(parcel, f0.CREATOR);
                w6.a.b(parcel);
                g gVar = this.f48885b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.M = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f48893a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f48955c;
                        } else {
                            n nVar2 = (n) a2.f48956a;
                            if (nVar2 != null) {
                                if (nVar2.f48957a < nVar.f48957a) {
                                }
                            }
                        }
                        a2.f48956a = nVar;
                    }
                }
                Bundle bundle = f0Var.f48910a;
                l.i(this.f48885b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f48885b.B(readInt, readStrongBinder, bundle, this.f48886c);
                this.f48885b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) w6.a.a(parcel, Bundle.CREATOR);
                w6.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            w6.a.b(parcel);
            l.i(this.f48885b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f48885b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) w6.a.a(parcel, Bundle.CREATOR), this.f48886c);
            this.f48885b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
