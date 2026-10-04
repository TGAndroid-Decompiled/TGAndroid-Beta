package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] f47563a;
    public final int f47564b;

    public a(PointF[] pointFArr, int i10) {
        this.f47563a = pointFArr;
        this.f47564b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.o(parcel, 2, this.f47563a, i10);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f47564b);
        g0.r(parcel, q6);
    }
}
