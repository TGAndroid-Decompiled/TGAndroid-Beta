package u7;

import android.os.Parcel;
public abstract class w extends a8.q implements x {
    public w() {
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
        Q0((u) d.a(parcel, u.CREATOR));
        return true;
    }
}
