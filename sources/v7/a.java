package v7;

import android.os.Parcel;
import android.os.RemoteException;
import z5.l;
public final class a {
    public final e7.h f49437a;

    public a(e7.h hVar) {
        l.h(hVar);
        this.f49437a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            e7.h hVar = this.f49437a;
            e7.h hVar2 = ((a) obj).f49437a;
            e7.f fVar = (e7.f) hVar;
            Parcel M0 = fVar.M0();
            e7.b.c(M0, hVar2);
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
            e7.f fVar = (e7.f) this.f49437a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
