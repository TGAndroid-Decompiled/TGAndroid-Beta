package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f55315a;
    public final boolean f55316b;
    public final boolean f55317c;
    public final int[] d;
    public final int f55318e;
    public final int[] f55319f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f55315a = oVar;
        this.f55316b = z10;
        this.f55317c = z11;
        this.d = iArr;
        this.f55318e = i7;
        this.f55319f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f55315a, i7);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f55316b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f55317c ? 1 : 0);
        yb.g(parcel, 4, this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f55318e);
        yb.g(parcel, 6, this.f55319f);
        yb.s(parcel, r10);
    }
}
