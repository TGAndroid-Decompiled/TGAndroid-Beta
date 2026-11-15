package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f57944a;
    public String f57945b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f57944a);
        yb.l(parcel, 3, this.f57945b);
        yb.s(parcel, r10);
    }
}
