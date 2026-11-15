package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f54918a;
    public final a[] f54919b;
    public final int f54920c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z10) {
        this.f54918a = j3;
        this.f54919b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f54920c = i7;
        } else {
            this.f54920c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f54918a);
        yb.o(parcel, 3, this.f54919b, i7);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f54920c);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.s(parcel, r10);
    }
}
