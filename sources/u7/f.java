package u7;

import android.os.Parcel;
import android.os.RemoteException;
import d7.i;
import n2.b0;
import y5.l;

public final class f {

    public final d7.a f48442a;

    public f(d7.a aVar) {
        l.h(aVar);
        this.f48442a = aVar;
    }

    public final void a(b0 b0Var) {
        d7.a aVar = this.f48442a;
        try {
            i6.a aVar2 = (i6.a) b0Var.f18130b;
            i iVar = (i) aVar;
            Parcel parcelM0 = iVar.M0();
            d7.b.c(parcelM0, aVar2);
            iVar.Q0(parcelM0, 18);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            d7.a aVar = this.f48442a;
            d7.a aVar2 = ((f) obj).f48442a;
            i iVar = (i) aVar;
            Parcel parcelM0 = iVar.M0();
            d7.b.c(parcelM0, aVar2);
            Parcel parcelL0 = iVar.L0(parcelM0, 16);
            boolean z10 = parcelL0.readInt() != 0;
            parcelL0.recycle();
            return z10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.f48442a;
            Parcel parcelL0 = iVar.L0(iVar.M0(), 17);
            int i10 = parcelL0.readInt();
            parcelL0.recycle();
            return i10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
