package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
public final class a {
    public final g7.h f50436a;

    public a(g7.h hVar) {
        m.h(hVar);
        this.f50436a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z4 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            g7.h hVar = this.f50436a;
            g7.h hVar2 = ((a) obj).f50436a;
            g7.f fVar = (g7.f) hVar;
            Parcel M0 = fVar.M0();
            g7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            if (L0.readInt() != 0) {
                z4 = true;
            }
            L0.recycle();
            return z4;
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final int hashCode() {
        try {
            g7.f fVar = (g7.f) this.f50436a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }
}
