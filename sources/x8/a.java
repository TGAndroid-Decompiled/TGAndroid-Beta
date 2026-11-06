package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] f58535a;
    public final int f58536b;

    public a(PointF[] pointFArr, int i7) {
        this.f58535a = pointFArr;
        this.f58536b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.o(parcel, 2, this.f58535a, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f58536b);
        wb.s(parcel, r10);
    }
}
