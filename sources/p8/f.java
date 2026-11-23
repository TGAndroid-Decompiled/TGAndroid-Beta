package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f55539a;
    public final a[] f55540b;
    public final int f55541c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z10) {
        this.f55539a = j3;
        this.f55540b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f55541c = i7;
        } else {
            this.f55541c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f55539a);
        bc.o(parcel, 3, this.f55540b, i7);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f55541c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
