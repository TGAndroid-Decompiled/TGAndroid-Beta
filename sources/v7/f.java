package v7;

import android.os.Parcel;
import android.os.RemoteException;
import e7.i;
import org.telegram.ui.Components.n;
import z5.l;
public final class f {
    public final e7.a f49450a;

    public f(e7.a aVar) {
        l.h(aVar);
        this.f49450a = aVar;
    }

    public final void a(n nVar) {
        try {
            i iVar = (i) this.f49450a;
            Parcel M0 = iVar.M0();
            e7.b.c(M0, (j6.a) nVar.f30787b);
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
            e7.a aVar = this.f49450a;
            e7.a aVar2 = ((f) obj).f49450a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            e7.b.c(M0, aVar2);
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
            i iVar = (i) this.f49450a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
