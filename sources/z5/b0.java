package z5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends c7.a {
    public g f50585b;
    public final int f50586c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 11);
        this.f50585b = gVar;
        this.f50586c = i10;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        n nVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                f0 f0Var = (f0) y6.a.a(parcel, f0.CREATOR);
                y6.a.b(parcel);
                g gVar = this.f50585b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.M = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f50593a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f50655c;
                        } else {
                            n nVar2 = (n) a2.f50656a;
                            if (nVar2 != null) {
                                if (nVar2.f50657a < nVar.f50657a) {
                                }
                            }
                        }
                        a2.f50656a = nVar;
                    }
                }
                Bundle bundle = f0Var.f50610a;
                l.i(this.f50585b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f50585b.B(readInt, readStrongBinder, bundle, this.f50586c);
                this.f50585b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) y6.a.a(parcel, Bundle.CREATOR);
                y6.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            y6.a.b(parcel);
            l.i(this.f50585b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f50585b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) y6.a.a(parcel, Bundle.CREATOR), this.f50586c);
            this.f50585b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
