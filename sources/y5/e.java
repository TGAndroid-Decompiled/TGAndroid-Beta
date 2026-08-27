package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new w7.f(18);

    public final n f49610a;

    public final boolean f49611b;

    public final boolean f49612c;
    public final int[] d;

    public final int f49613e;

    public final int[] f49614f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f49610a = nVar;
        this.f49611b = z10;
        this.f49612c = z11;
        this.d = iArr;
        this.f49613e = i10;
        this.f49614f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f49610a, i10);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f49611b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49612c ? 1 : 0);
        r8.g(parcel, 4, this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f49613e);
        r8.g(parcel, 6, this.f49614f);
        r8.r(parcel, iQ);
    }
}
