package q6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class d0 extends a8.q {
    public d f55924b;
    public final int f55925c;

    public d0(d dVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 9);
        this.f55924b = dVar;
        this.f55925c = i7;
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
                d dVar = this.f55924b;
                m.i(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.h(h0Var);
                dVar.B = h0Var;
                if (dVar.x()) {
                    f fVar = h0Var.d;
                    n a10 = n.a();
                    if (fVar == null) {
                        oVar = null;
                    } else {
                        oVar = fVar.f55930a;
                    }
                    synchronized (a10) {
                        if (oVar == null) {
                            oVar = n.f55981c;
                        } else {
                            o oVar2 = (o) a10.f55982a;
                            if (oVar2 != null) {
                                if (oVar2.f55983a < oVar.f55983a) {
                                }
                            }
                        }
                        a10.f55982a = oVar;
                    }
                }
                Bundle bundle = h0Var.f55948a;
                m.i(this.f55924b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f55924b.w(readInt, readStrongBinder, bundle, this.f55925c);
                this.f55924b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) p7.g.a(parcel, Bundle.CREATOR);
                p7.g.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            p7.g.c(parcel);
            m.i(this.f55924b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f55924b.w(parcel.readInt(), parcel.readStrongBinder(), (Bundle) p7.g.a(parcel, Bundle.CREATOR), this.f55925c);
            this.f55924b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
