package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(12);
    public String f61220a;
    public String f61221b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f61220a);
        yb.l(parcel, 3, this.f61221b);
        yb.s(parcel, r10);
    }
}
