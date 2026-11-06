package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new o(9);
    public String f56342a;
    public String f56343b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56342a);
        xb.l(parcel, 3, this.f56343b);
        xb.s(parcel, r10);
    }
}
