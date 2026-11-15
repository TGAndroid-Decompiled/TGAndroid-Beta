package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61226a;
    public String f61227b;
    public f f61228c;
    public g d;
    public g f61229e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61226a);
        yb.l(parcel, 3, this.f61227b);
        yb.k(parcel, 4, this.f61228c, i7);
        yb.k(parcel, 5, this.d, i7);
        yb.k(parcel, 6, this.f61229e, i7);
        yb.s(parcel, r10);
    }
}
