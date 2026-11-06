package q6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class d0 extends a8.q {
    public d f53743b;
    public final int f53744c;

    public d0(d dVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 9);
        this.f53743b = dVar;
        this.f53744c = i7;
    }

    @Override
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
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
                d dVar = this.f53743b;
                m.h(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.g(h0Var);
                dVar.B = h0Var;
                if (dVar.x()) {
                    f fVar = h0Var.d;
                    n a10 = n.a();
                    if (fVar == null) {
                        oVar = null;
                    } else {
                        oVar = fVar.f53749a;
                    }
                    synchronized (a10) {
                        if (oVar == null) {
                            oVar = n.f53800c;
                        } else {
                            o oVar2 = (o) a10.f53801a;
                            if (oVar2 != null) {
                                if (oVar2.f53802a < oVar.f53802a) {
                                }
                            }
                        }
                        a10.f53801a = oVar;
                    }
                }
                Bundle bundle = h0Var.f53767a;
                m.h(this.f53743b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f53743b.w(readInt, readStrongBinder, bundle, this.f53744c);
                this.f53743b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) p7.g.a(parcel, Bundle.CREATOR);
                p7.g.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            p7.g.c(parcel);
            m.h(this.f53743b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f53743b.w(parcel.readInt(), parcel.readStrongBinder(), (Bundle) p7.g.a(parcel, Bundle.CREATOR), this.f53744c);
            this.f53743b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
