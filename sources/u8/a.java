package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] f48871a;
    public final int f48872b;

    public a(PointF[] pointFArr, int i10) {
        this.f48871a = pointFArr;
        this.f48872b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.o(parcel, 2, this.f48871a, i10);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f48872b);
        d0.r(parcel, q6);
    }
}
