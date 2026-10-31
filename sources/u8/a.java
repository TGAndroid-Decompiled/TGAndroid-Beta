package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new n(21);
    public final PointF[] f50183a;
    public final int f50184b;

    public a(PointF[] pointFArr, int i10) {
        this.f50183a = pointFArr;
        this.f50184b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.o(parcel, 2, this.f50183a, i10);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f50184b);
        h0.r(parcel, q6);
    }
}
