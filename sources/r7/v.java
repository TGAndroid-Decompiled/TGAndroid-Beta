package r7;

import android.os.Parcel;
public abstract class v extends b8.b implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override
    public final boolean L0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        d.b(parcel);
        r0((t) d.a(parcel, t.CREATOR));
        return true;
    }
}
