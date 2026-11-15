package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(8);
    public String f61207a;
    public String f61208b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61207a);
        yb.l(parcel, 3, this.f61208b);
        yb.s(parcel, r10);
    }
}
