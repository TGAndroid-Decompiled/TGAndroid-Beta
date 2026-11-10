package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(8);
    public String f60007a;
    public String f60008b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60007a);
        xb.l(parcel, 3, this.f60008b);
        xb.s(parcel, r10);
    }
}
