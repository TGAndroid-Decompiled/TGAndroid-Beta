package u7;

import android.os.Parcel;
import android.os.RemoteException;
import y5.l;

public final class a {

    public final d7.h f48429a;

    public a(d7.h hVar) {
        l.h(hVar);
        this.f48429a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            d7.h hVar = this.f48429a;
            d7.h hVar2 = ((a) obj).f48429a;
            d7.f fVar = (d7.f) hVar;
            Parcel parcelM0 = fVar.M0();
            d7.b.c(parcelM0, hVar2);
            Parcel parcelL0 = fVar.L0(parcelM0, 17);
            boolean z10 = parcelL0.readInt() != 0;
            parcelL0.recycle();
            return z10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public final int hashCode() {
        try {
            d7.f fVar = (d7.f) this.f48429a;
            Parcel parcelL0 = fVar.L0(fVar.M0(), 18);
            int i10 = parcelL0.readInt();
            parcelL0.recycle();
            return i10;
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
