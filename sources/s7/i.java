package s7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import li.h5;
import s4.o0;
public final class i extends c8.b implements h8.n {
    public static final int f47939c = 0;
    public final androidx.activity.n f47940b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f47940b = nVar;
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f47940b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                K0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new jg.i((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR)));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new h5((LocationResult) d.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void K0() {
        this.f47940b.e().a(new o0(this));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f47940b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f2121b;
            if (pVar2 != pVar) {
                pVar2.f6598b = null;
                pVar2.f6599c = null;
                nVar.f2121b = pVar;
            }
        }
    }
}
