package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ji.u4;
import k2.g0;
public final class i extends b8.b implements g8.n {
    public static final int f44941c = 0;
    public final androidx.activity.o f44942b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f44942b = oVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f44942b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            oVar.e().a(new g0((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 18));
            return true;
        }
        d.b(parcel);
        oVar.e().a(new mg.n((LocationResult) d.a(parcel, LocationResult.CREATOR), 12));
        return true;
    }

    public final void L0() {
        this.f44942b.e().a(new u4(this, 20));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f44942b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f884c;
            if (pVar2 != pVar) {
                pVar2.f5075b = null;
                pVar2.f5076c = null;
                oVar.f884c = pVar;
            }
        }
    }
}
