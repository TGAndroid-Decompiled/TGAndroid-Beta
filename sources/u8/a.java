package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(0);
    public int f57901a;
    public String[] f57902b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57901a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.m(parcel, 3, this.f57902b);
        yb.s(parcel, r10);
    }
}
