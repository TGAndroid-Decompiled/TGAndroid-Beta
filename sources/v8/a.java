package v8;

import a8.df;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(22);
    public final PointF[] f50087a;
    public final int f50088b;

    public a(PointF[] pointFArr, int i10) {
        this.f50087a = pointFArr;
        this.f50088b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.o(parcel, 2, this.f50087a, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f50088b);
        df.r(parcel, q5);
    }
}
