package v7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import java.util.HashMap;
public final class c {
    public final w7.f f45687a;
    public h f45688b;

    public c(w7.f fVar) {
        new HashMap();
        m.h(fVar);
        this.f45687a = fVar;
    }

    public final void a(int i10) {
        try {
            w7.f fVar = this.f45687a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
