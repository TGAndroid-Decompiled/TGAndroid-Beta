package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f50526a;
    public final int f50527b;
    public final byte[] f50528c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f50526a = i10;
        this.f50527b = i11;
        this.f50528c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f50526a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50527b);
        w7.g0.c(parcel, 3, this.f50528c);
        w7.g0.r(parcel, q6);
    }
}
