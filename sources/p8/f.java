package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f55617a;
    public final a[] f55618b;
    public final int f55619c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z10) {
        this.f55617a = j3;
        this.f55618b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f55619c = i7;
        } else {
            this.f55619c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f55617a);
        cc.o(parcel, 3, this.f55618b, i7);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f55619c);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }
}
