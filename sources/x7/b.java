package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
public final class b {
    public final g7.h f46899a;

    public b(g7.h hVar) {
        m.h(hVar);
        this.f46899a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z4 = false;
        if (!(obj instanceof b)) {
            return false;
        }
        try {
            g7.h hVar = this.f46899a;
            g7.h hVar2 = ((b) obj).f46899a;
            g7.f fVar = (g7.f) hVar;
            Parcel M0 = fVar.M0();
            g7.b.c(M0, hVar2);
            Parcel L0 = fVar.L0(M0, 17);
            if (L0.readInt() != 0) {
                z4 = true;
            }
            L0.recycle();
            return z4;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            g7.f fVar = (g7.f) this.f46899a;
            Parcel L0 = fVar.L0(fVar.M0(), 18);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
