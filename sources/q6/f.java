package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o f53773a;
    public final boolean f53774b;
    public final boolean f53775c;
    public final int[] d;
    public final int f53776e;
    public final int[] f53777f;

    public f(o oVar, boolean z9, boolean z10, int[] iArr, int i7, int[] iArr2) {
        this.f53773a = oVar;
        this.f53774b = z9;
        this.f53775c = z10;
        this.d = iArr;
        this.f53776e = i7;
        this.f53777f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f53773a, i7);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53774b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53775c ? 1 : 0);
        xb.g(parcel, 4, this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53776e);
        xb.g(parcel, 6, this.f53777f);
        xb.s(parcel, r10);
    }
}
