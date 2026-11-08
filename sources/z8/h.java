package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f60019a;
    public String f60020b;
    public f f60021c;
    public g d;
    public g f60022e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60019a);
        xb.l(parcel, 3, this.f60020b);
        xb.k(parcel, 4, this.f60021c, i7);
        xb.k(parcel, 5, this.d, i7);
        xb.k(parcel, 6, this.f60022e, i7);
        xb.s(parcel, r10);
    }
}
