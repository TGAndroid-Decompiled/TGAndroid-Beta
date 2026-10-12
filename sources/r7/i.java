package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ji.d4;
import ji.h5;
import ji.w4;
public final class i extends b8.b implements g8.n {
    public static final int f43950c = 0;
    public final androidx.activity.o f43951b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f43951b = oVar;
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f43951b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                K0();
                return true;
            }
            d.b(parcel);
            oVar.e().a(new h5((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 22));
            return true;
        }
        d.b(parcel);
        oVar.e().a(new w4((LocationResult) d.a(parcel, LocationResult.CREATOR), 23));
        return true;
    }

    public final void K0() {
        this.f43951b.e().a(new d4(this, 21));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f43951b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f1049b;
            if (pVar2 != pVar) {
                pVar2.f5007b = null;
                pVar2.f5008c = null;
                oVar.f1049b = pVar;
            }
        }
    }
}
