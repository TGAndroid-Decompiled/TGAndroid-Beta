package t7;

import android.os.Parcel;
import android.os.RemoteException;
import x5.l;
public final class a {
    public final c7.h f47707a;

    public a(c7.h hVar) {
        l.h(hVar);
        this.f47707a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            c7.h hVar = this.f47707a;
            c7.h hVar2 = ((a) obj).f47707a;
            c7.f fVar = (c7.f) hVar;
            Parcel M0 = fVar.M0();
            c7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            if (L0.readInt() != 0) {
                z10 = true;
            }
            L0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            c7.f fVar = (c7.f) this.f47707a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
