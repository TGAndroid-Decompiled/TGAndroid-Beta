package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.uy;
public final class i extends a8.q implements j8.j {
    public static final int f56257c = 0;
    public final androidx.activity.n f56258b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 11);
        this.f56258b = nVar;
    }

    @Override
    public final boolean L0(Parcel parcel, int i7) {
        androidx.activity.n nVar = this.f56258b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                M0();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
            d.b(parcel);
            nVar.g().a(new Object());
            return true;
        }
        d.b(parcel);
        nVar.g().a(new org.telegram.ui.Components.n((LocationResult) d.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void M0() {
        this.f56258b.g().a(new uy(this, 23));
    }

    public final void N0(com.google.android.gms.common.api.internal.o oVar) {
        androidx.activity.n nVar = this.f56258b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) nVar.f1847c;
            if (oVar2 != oVar) {
                oVar2.f6671b = null;
                nVar.f1847c = oVar;
            }
        }
    }
}
