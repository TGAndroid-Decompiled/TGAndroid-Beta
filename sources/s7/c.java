package s7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import y5.l;

public final class c {

    public final t7.f f47804a;

    public h f47805b;

    public c(t7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f47804a = fVar;
    }

    public final void a(int i10) {
        try {
            t7.f fVar = this.f47804a;
            Parcel parcelM0 = fVar.M0();
            parcelM0.writeInt(i10);
            fVar.Q0(parcelM0, 16);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
