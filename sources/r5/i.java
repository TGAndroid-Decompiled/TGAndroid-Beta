package r5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.v6;
public final class i {
    public final c f43371a;

    public i(c cVar) {
        this.f43371a = cVar;
    }

    public final void a() {
        c cVar = this.f43371a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                s5.h hVar = cVar.f43359j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel M0 = oVar.M0();
                int i10 = com.google.android.gms.internal.cast.t.f3163a;
                M0.writeInt(0);
                oVar.Q0(M0, 1);
            } catch (RemoteException e) {
                c.f43354m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f43361l;
            if (o4Var != null) {
                c5.j.D(o4Var.f3121a, new v6(new b4.e0(3, 3)));
            }
        }
    }
}
