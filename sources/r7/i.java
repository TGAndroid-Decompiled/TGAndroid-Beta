package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ki.e0;
public final class i extends b8.b implements g8.n {
    public static final int f42390c = 0;
    public final androidx.activity.n f42391b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f42391b = nVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f42391b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new k2.e((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 20));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new o0.b((LocationResult) d.a(parcel, LocationResult.CREATOR), 14));
        return true;
    }

    public final void L0() {
        this.f42391b.e().a(new e0(this, 19));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f42391b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f1908c;
            if (pVar2 != pVar) {
                pVar2.f6143b = null;
                pVar2.f6144c = null;
                nVar.f1908c = pVar;
            }
        }
    }
}
