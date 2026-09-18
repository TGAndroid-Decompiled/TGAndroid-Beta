package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class i extends b8.b implements g8.n {
    public static final int f42325c = 0;
    public final androidx.activity.n f42326b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f42326b = nVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f42326b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new k2.u((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 22));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new ka.c((LocationResult) d.a(parcel, LocationResult.CREATOR), 18));
        return true;
    }

    public final void L0() {
        this.f42326b.e().a(new l.d(this));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f42326b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f1909c;
            if (pVar2 != pVar) {
                pVar2.f6144b = null;
                pVar2.f6145c = null;
                nVar.f1909c = pVar;
            }
        }
    }
}
