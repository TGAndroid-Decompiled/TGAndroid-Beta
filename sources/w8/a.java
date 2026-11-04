package w8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);
    public final PointF[] f57411a;
    public final int f57412b;

    public a(PointF[] pointFArr, int i3) {
        this.f57411a = pointFArr;
        this.f57412b = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.p(parcel, 2, this.f57411a, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f57412b);
        j8.a.t(parcel, s6);
    }
}
