package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f51866a;
    public final int f51867b;
    public final byte[] f51868c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f51866a = i10;
        this.f51867b = i11;
        this.f51868c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f51866a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51867b);
        w7.d0.c(parcel, 3, this.f51868c);
        w7.d0.r(parcel, q6);
    }
}
