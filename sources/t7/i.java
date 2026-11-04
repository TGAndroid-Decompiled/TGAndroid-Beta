package t7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
public final class i extends com.google.android.gms.internal.cast.o implements i8.j {
    public static final int f54961c = 0;
    public final androidx.activity.n f54962b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.f54962b = nVar;
    }

    @Override
    public final boolean L0(Parcel parcel, int i3) {
        androidx.activity.n nVar = this.f54962b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
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
        nVar.g().a(new y00((LocationResult) d.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void M0() {
        this.f54962b.g().a(new nh(this, 19));
    }

    public final void N0(com.google.android.gms.common.api.internal.o oVar) {
        androidx.activity.n nVar = this.f54962b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) nVar.f1270c;
            if (oVar2 != oVar) {
                oVar2.f6726b = null;
                nVar.f1270c = oVar;
            }
        }
    }
}
