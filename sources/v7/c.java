package v7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import java.util.HashMap;
public final class c {
    public final w7.f f48919a;
    public h f48920b;

    public c(w7.f fVar) {
        new HashMap();
        m.h(fVar);
        this.f48919a = fVar;
    }

    public final void a(int i10) {
        try {
            w7.f fVar = this.f48919a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }
}
