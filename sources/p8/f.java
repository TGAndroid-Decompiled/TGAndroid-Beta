package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f53407a;
    public final a[] f53408b;
    public final int f53409c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z9) {
        this.f53407a = j3;
        this.f53408b = aVarArr;
        this.d = z9;
        if (z9) {
            this.f53409c = i7;
        } else {
            this.f53409c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f53407a);
        xb.o(parcel, 3, this.f53408b, i7);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f53409c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.s(parcel, r10);
    }
}
