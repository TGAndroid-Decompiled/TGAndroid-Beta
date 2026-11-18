package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f55889a;
    public final boolean f55890b;
    public final boolean f55891c;
    public final int[] d;
    public final int f55892e;
    public final int[] f55893f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f55889a = oVar;
        this.f55890b = z10;
        this.f55891c = z11;
        this.d = iArr;
        this.f55892e = i7;
        this.f55893f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f55889a, i7);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55890b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55891c ? 1 : 0);
        bc.g(parcel, 4, this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f55892e);
        bc.g(parcel, 6, this.f55893f);
        bc.s(parcel, r10);
    }
}
