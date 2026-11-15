package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(14);
    public String f61224a;
    public String f61225b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61224a);
        yb.l(parcel, 3, this.f61225b);
        yb.s(parcel, r10);
    }
}
