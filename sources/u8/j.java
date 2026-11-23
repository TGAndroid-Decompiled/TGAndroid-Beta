package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new o(9);
    public String f58518a;
    public String f58519b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58518a);
        cc.l(parcel, 3, this.f58519b);
        cc.s(parcel, r10);
    }
}
