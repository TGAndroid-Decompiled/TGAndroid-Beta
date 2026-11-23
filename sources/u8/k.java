package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f58520a;
    public String f58521b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58520a);
        cc.l(parcel, 3, this.f58521b);
        cc.s(parcel, r10);
    }
}
