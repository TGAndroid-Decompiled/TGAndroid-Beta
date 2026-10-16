package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ji.h5;
import ji.w4;
public final class i extends b8.b implements g8.n {
    public static final int f43709c = 0;
    public final androidx.activity.o f43710b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f43710b = oVar;
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f43710b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                K0();
                return true;
            }
            d.b(parcel);
            oVar.e().a(new w4((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 22));
            return true;
        }
        d.b(parcel);
        oVar.e().a(new m.l((LocationResult) d.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void K0() {
        this.f43710b.e().a(new h5(this, 22));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f43710b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f1053b;
            if (pVar2 != pVar) {
                pVar2.f5010b = null;
                pVar2.f5011c = null;
                oVar.f1053b = pVar;
            }
        }
    }
}
