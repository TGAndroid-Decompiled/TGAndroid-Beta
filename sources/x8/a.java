package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f60461a;
    public final int f60462b;

    public a(PointF[] pointFArr, int i7) {
        this.f60461a = pointFArr;
        this.f60462b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 2, this.f60461a, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f60462b);
        bc.s(parcel, r10);
    }
}
