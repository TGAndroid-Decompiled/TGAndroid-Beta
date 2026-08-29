package t7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import z5.l;
public final class c {
    public final u7.f f48167a;
    public h f48168b;

    public c(u7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f48167a = fVar;
    }

    public final void a(int i10) {
        try {
            u7.f fVar = this.f48167a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
