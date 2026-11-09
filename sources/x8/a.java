package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f58664a;
    public final int f58665b;

    public a(PointF[] pointFArr, int i7) {
        this.f58664a = pointFArr;
        this.f58665b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 2, this.f58664a, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f58665b);
        xb.s(parcel, r10);
    }
}
