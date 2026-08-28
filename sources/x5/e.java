package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new w7.i(10);
    public final n f48893a;
    public final boolean f48894b;
    public final boolean f48895c;
    public final int[] d;
    public final int f48896e;
    public final int[] f48897f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i9, int[] iArr2) {
        this.f48893a = nVar;
        this.f48894b = z10;
        this.f48895c = z11;
        this.d = iArr;
        this.f48896e = i9;
        this.f48897f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f48893a, i9);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48894b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48895c ? 1 : 0);
        p8.g(parcel, 4, this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f48896e);
        p8.g(parcel, 6, this.f48897f);
        p8.r(parcel, q10);
    }
}
