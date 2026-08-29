package p5;

import ag.j2;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;
public final class i {
    public final c f45640a;

    public i(c cVar) {
        this.f45640a = cVar;
    }

    public final void a() {
        c cVar = this.f45640a;
        q qVar = cVar.f45625e;
        if (qVar != null) {
            try {
                q5.h hVar = cVar.f45629j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel M0 = oVar.M0();
                int i10 = com.google.android.gms.internal.cast.u.f4281a;
                M0.writeInt(0);
                oVar.Q0(M0, 1);
            } catch (RemoteException e10) {
                c.f45623m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f45631l;
            if (o4Var != null) {
                a5.j.y(o4Var.f4220a, new w6(new j2(3, 4)));
            }
        }
    }
}
