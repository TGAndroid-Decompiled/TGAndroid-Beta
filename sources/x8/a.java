package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f60544a;
    public final int f60545b;

    public a(PointF[] pointFArr, int i7) {
        this.f60544a = pointFArr;
        this.f60545b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.o(parcel, 2, this.f60544a, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f60545b);
        cc.s(parcel, r10);
    }
}
