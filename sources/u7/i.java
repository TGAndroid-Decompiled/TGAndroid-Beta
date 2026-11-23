package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;
public final class i extends a8.q implements j8.j {
    public static final int f58492c = 0;
    public final androidx.activity.n f58493b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 11);
        this.f58493b = nVar;
    }

    @Override
    public final boolean l1(Parcel parcel, int i7) {
        androidx.activity.n nVar = this.f58493b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                m1();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
            d.b(parcel);
            nVar.i().a(new Object());
            return true;
        }
        d.b(parcel);
        nVar.i().a(new jn((LocationResult) d.a(parcel, LocationResult.CREATOR), 23));
        return true;
    }

    public final void m1() {
        this.f58493b.i().a(new qf(this, 22));
    }

    public final void n1(com.google.android.gms.common.api.internal.o oVar) {
        androidx.activity.n nVar = this.f58493b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) nVar.f1808c;
            if (oVar2 != oVar) {
                oVar2.f6367b = null;
                nVar.f1808c = oVar;
            }
        }
    }
}
