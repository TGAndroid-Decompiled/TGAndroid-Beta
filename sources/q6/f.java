package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f55930a;
    public final boolean f55931b;
    public final boolean f55932c;
    public final int[] d;
    public final int f55933e;
    public final int[] f55934f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.f55930a = oVar;
        this.f55931b = z10;
        this.f55932c = z11;
        this.d = iArr;
        this.f55933e = i7;
        this.f55934f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f55930a, i7);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55931b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55932c ? 1 : 0);
        bc.g(parcel, 4, this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f55933e);
        bc.g(parcel, 6, this.f55934f);
        bc.s(parcel, r10);
    }
}
