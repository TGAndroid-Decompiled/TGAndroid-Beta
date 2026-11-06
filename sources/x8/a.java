package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f58559a;
    public final int f58560b;

    public a(PointF[] pointFArr, int i7) {
        this.f58559a = pointFArr;
        this.f58560b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 2, this.f58559a, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f58560b);
        xb.s(parcel, r10);
    }
}
