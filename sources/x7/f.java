package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import g7.i;
import ph.j5;
public final class f {
    public final g7.a f46843a;

    public f(g7.a aVar) {
        m.h(aVar);
        this.f46843a = aVar;
    }

    public final void a(j5 j5Var) {
        try {
            i iVar = (i) this.f46843a;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, (l6.a) j5Var.f41782b);
            iVar.Q0(M0, 18);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z4 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            g7.a aVar = this.f46843a;
            g7.a aVar2 = ((f) obj).f46843a;
            i iVar = (i) aVar;
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
            i iVar = (i) this.f46843a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
