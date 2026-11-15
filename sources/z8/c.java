package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f61212a;
    public d f61213b;
    public f f61214c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61212a);
        yb.k(parcel, 3, this.f61213b, i7);
        yb.k(parcel, 5, this.f61214c, i7);
        yb.s(parcel, r10);
    }
}
