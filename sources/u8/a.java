package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] f49101a;
    public final int f49102b;

    public a(PointF[] pointFArr, int i10) {
        this.f49101a = pointFArr;
        this.f49102b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.o(parcel, 2, this.f49101a, i10);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f49102b);
        c0.r(parcel, q6);
    }
}
