package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f56446a;
    public String f56447b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56446a);
        xb.l(parcel, 3, this.f56447b);
        xb.s(parcel, r10);
    }
}
