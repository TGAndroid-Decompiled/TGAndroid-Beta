package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f59925a;
    public String f59926b;
    public f f59927c;
    public g d;
    public g f59928e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59925a);
        xb.l(parcel, 3, this.f59926b);
        xb.k(parcel, 4, this.f59927c, i7);
        xb.k(parcel, 5, this.d, i7);
        xb.k(parcel, 6, this.f59928e, i7);
        xb.s(parcel, r10);
    }
}
