package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
public final class g {
    public final g7.a f46911a;

    public g(g7.a aVar) {
        m.h(aVar);
        this.f46911a = aVar;
    }

    public final void a(a aVar) {
        try {
            g7.i iVar = (g7.i) this.f46911a;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, (l6.a) aVar.f46898a);
            iVar.Q0(M0, 18);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z4 = false;
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            g7.a aVar = this.f46911a;
            g7.a aVar2 = ((g) obj).f46911a;
            g7.i iVar = (g7.i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
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
            g7.i iVar = (g7.i) this.f46911a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
