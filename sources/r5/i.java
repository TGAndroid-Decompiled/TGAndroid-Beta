package r5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.internal.cast.u6;
public final class i {
    public final c f46720a;

    public i(c cVar) {
        this.f46720a = cVar;
    }

    public final void a() {
        c cVar = this.f46720a;
        q qVar = cVar.f46704e;
        if (qVar != null) {
            try {
                s5.h hVar = cVar.f46708j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel M0 = oVar.M0();
                int i10 = com.google.android.gms.internal.cast.s.f3120a;
                M0.writeInt(0);
                oVar.Q0(M0, 1);
            } catch (RemoteException e6) {
                c.f46702m.a(e6, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            n4 n4Var = cVar.f46710l;
            if (n4Var != null) {
                c5.j.D(n4Var.f3070a, new u6(new b4.e0(3, 2)));
            }
        }
    }
}
