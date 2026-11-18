package u7;

import android.os.Parcel;
public abstract class v extends a8.q implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 11);
    }

    @Override
    public final boolean l1(Parcel parcel, int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            zze();
            return true;
        }
        d.b(parcel);
        P0((t) d.a(parcel, t.CREATOR));
        return true;
    }
}
