package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46692a;
    public final int f46693b;
    public final byte[] f46694c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46692a = i10;
        this.f46693b = i11;
        this.f46694c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46692a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46693b);
        w7.f0.c(parcel, 3, this.f46694c);
        w7.f0.r(parcel, q6);
    }
}
