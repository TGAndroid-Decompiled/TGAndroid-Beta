package t7;

import android.os.Parcel;
public abstract class v extends com.google.android.gms.internal.cast.o implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override
    public final boolean L0(Parcel parcel, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            zze();
            return true;
        }
        d.b(parcel);
        X((t) d.a(parcel, t.CREATOR));
        return true;
    }
}
