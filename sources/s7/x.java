package s7;

import android.os.Parcel;
public abstract class x extends c8.b implements y {
    public x() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        d.b(parcel);
        v0((v) d.a(parcel, v.CREATOR));
        return true;
    }
}
