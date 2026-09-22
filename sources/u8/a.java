package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] f43964a;
    public final int f43965b;

    public a(PointF[] pointFArr, int i10) {
        this.f43964a = pointFArr;
        this.f43965b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 2, this.f43964a, i10);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f43965b);
        f0.r(parcel, q6);
    }
}
