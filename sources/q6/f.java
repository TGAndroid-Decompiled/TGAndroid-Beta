package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f53878a;
    public final boolean f53879b;
    public final boolean f53880c;
    public final int[] d;
    public final int f53881e;
    public final int[] f53882f;

    public f(o oVar, boolean z9, boolean z10, int[] iArr, int i7, int[] iArr2) {
        this.f53878a = oVar;
        this.f53879b = z9;
        this.f53880c = z10;
        this.d = iArr;
        this.f53881e = i7;
        this.f53882f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f53878a, i7);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53879b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53880c ? 1 : 0);
        xb.g(parcel, 4, this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53881e);
        xb.g(parcel, 6, this.f53882f);
        xb.s(parcel, r10);
    }
}
