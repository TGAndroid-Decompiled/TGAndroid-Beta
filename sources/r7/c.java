package r7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import x5.l;
public final class c {
    public final s7.f f47084a;
    public h f47085b;

    public c(s7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f47084a = fVar;
    }

    public final void a(int i9) {
        try {
            s7.f fVar = this.f47084a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i9);
            fVar.Q0(M0, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
