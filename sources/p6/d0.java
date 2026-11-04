package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class d0 extends com.google.android.gms.internal.cast.o {
    public d f53237b;
    public final int f53238c;

    public d0(d dVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f53237b = dVar;
        this.f53238c = i3;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        o oVar;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) o7.g.a(parcel, h0.CREATOR);
                o7.g.c(parcel);
                d dVar = this.f53237b;
                m.h(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.g(h0Var);
                dVar.B = h0Var;
                if (dVar.w()) {
                    f fVar = h0Var.d;
                    n a10 = n.a();
                    if (fVar == null) {
                        oVar = null;
                    } else {
                        oVar = fVar.f53243a;
                    }
                    synchronized (a10) {
                        if (oVar == null) {
                            oVar = n.f53294c;
                        } else {
                            o oVar2 = (o) a10.f53295a;
                            if (oVar2 != null) {
                                if (oVar2.f53296a < oVar.f53296a) {
                                }
                            }
                        }
                        a10.f53295a = oVar;
                    }
                }
                Bundle bundle = h0Var.f53261a;
                m.h(this.f53237b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f53237b.v(readInt, readStrongBinder, bundle, this.f53238c);
                this.f53237b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) o7.g.a(parcel, Bundle.CREATOR);
                o7.g.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            o7.g.c(parcel);
            m.h(this.f53237b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f53237b.v(parcel.readInt(), parcel.readStrongBinder(), (Bundle) o7.g.a(parcel, Bundle.CREATOR), this.f53238c);
            this.f53237b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
