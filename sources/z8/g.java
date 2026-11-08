package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(14);
    public String f60016a;
    public String f60017b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60016a);
        xb.l(parcel, 3, this.f60017b);
        xb.s(parcel, r10);
    }
}
