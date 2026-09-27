package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class i extends b8.b implements g8.n {
    public static final int f42400c = 0;
    public final androidx.activity.n f42401b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f42401b = nVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f42401b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new k2.u((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR)));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new ka.c((LocationResult) d.a(parcel, LocationResult.CREATOR), 16));
        return true;
    }

    public final void L0() {
        this.f42401b.e().a(new l.d(this));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f42401b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f1903c;
            if (pVar2 != pVar) {
                pVar2.f6128b = null;
                pVar2.f6129c = null;
                nVar.f1903c = pVar;
            }
        }
    }
}
