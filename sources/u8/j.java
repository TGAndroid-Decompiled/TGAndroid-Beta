package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new o(9);
    public String f57942a;
    public String f57943b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f57942a);
        yb.l(parcel, 3, this.f57943b);
        yb.s(parcel, r10);
    }
}
