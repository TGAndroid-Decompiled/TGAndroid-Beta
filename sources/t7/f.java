package t7;

import android.os.Parcel;
import android.os.RemoteException;
import c7.i;
import m5.c0;
import x5.l;
public final class f {
    public final c7.a f47720a;

    public f(c7.a aVar) {
        l.h(aVar);
        this.f47720a = aVar;
    }

    public final void a(c0 c0Var) {
        try {
            i iVar = (i) this.f47720a;
            Parcel M0 = iVar.M0();
            c7.b.c(M0, (h6.a) c0Var.f17378b);
            iVar.Q0(M0, 18);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            c7.a aVar = this.f47720a;
            c7.a aVar2 = ((f) obj).f47720a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            c7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
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
            i iVar = (i) this.f47720a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
