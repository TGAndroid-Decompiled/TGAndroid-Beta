package q6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class d0 extends a8.q {
    public d f53860b;
    public final int f53861c;

    public d0(d dVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 9);
        this.f53860b = dVar;
        this.f53861c = i7;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        o oVar;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) p7.g.a(parcel, h0.CREATOR);
                p7.g.c(parcel);
                d dVar = this.f53860b;
                m.h(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.g(h0Var);
                dVar.B = h0Var;
                if (dVar.x()) {
                    f fVar = h0Var.d;
                    n a10 = n.a();
                    if (fVar == null) {
                        oVar = null;
                    } else {
                        oVar = fVar.f53866a;
                    }
                    synchronized (a10) {
                        if (oVar == null) {
                            oVar = n.f53917c;
                        } else {
                            o oVar2 = (o) a10.f53918a;
                            if (oVar2 != null) {
                                if (oVar2.f53919a < oVar.f53919a) {
                                }
                            }
                        }
                        a10.f53918a = oVar;
                    }
                }
                Bundle bundle = h0Var.f53884a;
                m.h(this.f53860b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f53860b.w(readInt, readStrongBinder, bundle, this.f53861c);
                this.f53860b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) p7.g.a(parcel, Bundle.CREATOR);
                p7.g.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            p7.g.c(parcel);
            m.h(this.f53860b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f53860b.w(parcel.readInt(), parcel.readStrongBinder(), (Bundle) p7.g.a(parcel, Bundle.CREATOR), this.f53861c);
            this.f53860b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
