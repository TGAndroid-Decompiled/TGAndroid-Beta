package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ki.t1;
public final class i extends b8.b implements g8.n {
    public static final int f45462c = 0;
    public final androidx.activity.o f45463b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f45463b = oVar;
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f45463b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                K0();
                return true;
            }
            d.b(parcel);
            oVar.e().a(new t1((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 24));
            return true;
        }
        d.b(parcel);
        oVar.e().a(new l2.f((LocationResult) d.a(parcel, LocationResult.CREATOR), 17));
        return true;
    }

    public final void K0() {
        this.f45463b.e().a(new le.b(this, 18));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f45463b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f2675b;
            if (pVar2 != pVar) {
                pVar2.f6488b = null;
                pVar2.f6489c = null;
                oVar.f2675b = pVar;
            }
        }
    }
}
