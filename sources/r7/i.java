package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import k2.c0;
import org.telegram.ui.Cells.ia;
public final class i extends b8.b implements g8.n {
    public static final int f42070c = 0;
    public final androidx.activity.n f42071b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f42071b = nVar;
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f42071b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                L0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new ia((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 10));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new c0((LocationResult) d.a(parcel, LocationResult.CREATOR), 22));
        return true;
    }

    public final void L0() {
        this.f42071b.e().a(new ka.c(this, 15));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f42071b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f1904c;
            if (pVar2 != pVar) {
                pVar2.f6139b = null;
                pVar2.f6140c = null;
                nVar.f1904c = pVar;
            }
        }
    }
}
