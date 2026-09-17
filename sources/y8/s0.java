package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f49674a;
    public final int f49675b;
    public final byte[] f49676c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f49674a = i10;
        this.f49675b = i11;
        this.f49676c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f49674a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49675b);
        w7.e0.c(parcel, 3, this.f49676c);
        w7.e0.r(parcel, q6);
    }
}
