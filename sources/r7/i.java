package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import r2.y;
public final class i extends b8.b implements g8.k {
    public static final int f46360c = 0;
    public final androidx.activity.o f46361b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f46361b = oVar;
    }

    @Override
    public final boolean L0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f46361b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                M0();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
            d.b(parcel);
            oVar.h().a(new Object());
            return true;
        }
        d.b(parcel);
        oVar.h().a(new n2.u((LocationResult) d.a(parcel, LocationResult.CREATOR), 20));
        return true;
    }

    public final void M0() {
        this.f46361b.h().a(new y(this, 1));
    }

    public final void N0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f46361b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f954c;
            if (pVar2 != pVar) {
                pVar2.f4458b = null;
                pVar2.f4459c = null;
                oVar.f954c = pVar;
            }
        }
    }
}
