package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.ff;
public final class j extends a8.q implements j8.j {
    public static final int f57881c = 0;
    public final androidx.activity.n f57882b;

    public j(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 11);
        this.f57882b = nVar;
    }

    @Override
    public final boolean l1(Parcel parcel, int i7) {
        androidx.activity.n nVar = this.f57882b;
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
        nVar.i().a(new i((LocationResult) d.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void m1() {
        this.f57882b.i().a(new ff(this, 21));
    }

    public final void n1(com.google.android.gms.common.api.internal.o oVar) {
        androidx.activity.n nVar = this.f57882b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) nVar.f1797c;
            if (oVar2 != oVar) {
                oVar2.f6055b = null;
                nVar.f1797c = oVar;
            }
        }
    }
}
