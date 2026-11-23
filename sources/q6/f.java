package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f56012a;
    public final boolean f56013b;
    public final boolean f56014c;
    public final int[] d;
    public final int f56015e;
    public final int[] f56016f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f56012a = oVar;
        this.f56013b = z10;
        this.f56014c = z11;
        this.d = iArr;
        this.f56015e = i7;
        this.f56016f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f56012a, i7);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f56013b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f56014c ? 1 : 0);
        cc.g(parcel, 4, this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f56015e);
        cc.g(parcel, 6, this.f56016f);
        cc.s(parcel, r10);
    }
}
