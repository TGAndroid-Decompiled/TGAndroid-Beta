package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f59845a;
    public final int f59846b;

    public a(PointF[] pointFArr, int i7) {
        this.f59845a = pointFArr;
        this.f59846b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.o(parcel, 2, this.f59845a, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f59846b);
        yb.s(parcel, r10);
    }
}
