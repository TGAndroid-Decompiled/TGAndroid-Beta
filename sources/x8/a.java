package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f60415a;
    public final int f60416b;

    public a(PointF[] pointFArr, int i7) {
        this.f60415a = pointFArr;
        this.f60416b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 2, this.f60415a, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f60416b);
        bc.s(parcel, r10);
    }
}
