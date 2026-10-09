package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f51820a;
    public final int f51821b;
    public final byte[] f51822c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f51820a = i10;
        this.f51821b = i11;
        this.f51822c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f51820a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51821b);
        w7.d0.c(parcel, 3, this.f51822c);
        w7.d0.r(parcel, q6);
    }
}
