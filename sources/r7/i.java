package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import m.g3;
public final class i extends b8.b implements g8.n {
    public static final int f41287c = 0;
    public final androidx.activity.o f41288b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f41288b = oVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f41288b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            oVar.e().a(new o0.b((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR)));
            return true;
        }
        d.b(parcel);
        oVar.e().a(new g3((LocationResult) d.a(parcel, LocationResult.CREATOR), 16));
        return true;
    }

    public final void L0() {
        this.f41288b.e().a(new l2.g(this, 17));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f41288b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f592c;
            if (pVar2 != pVar) {
                pVar2.f4918b = null;
                pVar2.f4919c = null;
                oVar.f592c = pVar;
            }
        }
    }
}
