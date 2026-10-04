package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ii.n4;
public final class i extends b8.b implements g8.n {
    public static final int f45849c = 0;
    public final androidx.activity.n f45850b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f45850b = nVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f45850b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new n2.c((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 15));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new n4((LocationResult) d.a(parcel, LocationResult.CREATOR), 21));
        return true;
    }

    public final void L0() {
        this.f45850b.e().a(new l2.g(this, 16));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f45850b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f2070c;
            if (pVar2 != pVar) {
                pVar2.f6602b = null;
                pVar2.f6603c = null;
                nVar.f2070c = pVar;
            }
        }
    }
}
