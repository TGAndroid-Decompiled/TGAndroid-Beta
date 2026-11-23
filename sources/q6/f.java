package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f55934a;
    public final boolean f55935b;
    public final boolean f55936c;
    public final int[] d;
    public final int f55937e;
    public final int[] f55938f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f55934a = oVar;
        this.f55935b = z10;
        this.f55936c = z11;
        this.d = iArr;
        this.f55937e = i7;
        this.f55938f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f55934a, i7);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55935b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55936c ? 1 : 0);
        bc.g(parcel, 4, this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f55937e);
        bc.g(parcel, 6, this.f55938f);
        bc.s(parcel, r10);
    }
}
