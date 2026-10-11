package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import k2.g0;
public final class i extends b8.b implements g8.n {
    public static final int f47098c = 0;
    public final androidx.activity.n f47099b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f47099b = nVar;
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f47099b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                K0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new l2.f((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 21));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new m2.t((LocationResult) d.a(parcel, LocationResult.CREATOR), 14));
        return true;
    }

    public final void K0() {
        this.f47099b.e().a(new g0(this, 21));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f47099b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f2148c;
            if (pVar2 != pVar) {
                pVar2.f6653b = null;
                pVar2.f6654c = null;
                nVar.f2148c = pVar;
            }
        }
    }
}
