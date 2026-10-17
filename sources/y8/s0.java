package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f50065a;
    public final int f50066b;
    public final byte[] f50067c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f50065a = i10;
        this.f50066b = i11;
        this.f50067c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f50065a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50066b);
        w7.f0.c(parcel, 3, this.f50067c);
        w7.f0.r(parcel, q6);
    }
}
