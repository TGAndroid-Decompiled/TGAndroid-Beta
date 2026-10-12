package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f52046a;
    public final int f52047b;
    public final byte[] f52048c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f52046a = i10;
        this.f52047b = i11;
        this.f52048c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f52046a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52047b);
        w7.c0.c(parcel, 3, this.f52048c);
        w7.c0.r(parcel, q6);
    }
}
