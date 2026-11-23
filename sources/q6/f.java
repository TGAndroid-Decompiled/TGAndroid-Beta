package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f55899a;
    public final boolean f55900b;
    public final boolean f55901c;
    public final int[] d;
    public final int f55902e;
    public final int[] f55903f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f55899a = oVar;
        this.f55900b = z10;
        this.f55901c = z11;
        this.d = iArr;
        this.f55902e = i7;
        this.f55903f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f55899a, i7);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f55900b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55901c ? 1 : 0);
        cc.g(parcel, 4, this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f55902e);
        cc.g(parcel, 6, this.f55903f);
        cc.s(parcel, r10);
    }
}
