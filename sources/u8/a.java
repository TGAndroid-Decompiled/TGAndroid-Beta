package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] f46972a;
    public final int f46973b;

    public a(PointF[] pointFArr, int i10) {
        this.f46972a = pointFArr;
        this.f46973b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 2, this.f46972a, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46973b);
        e0.r(parcel, q6);
    }
}
