package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(8);
    public String f61901a;
    public String f61902b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61901a);
        cc.l(parcel, 3, this.f61902b);
        cc.s(parcel, r10);
    }
}
