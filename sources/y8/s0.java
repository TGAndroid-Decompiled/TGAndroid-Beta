package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46691a;
    public final int f46692b;
    public final byte[] f46693c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46691a = i10;
        this.f46692b = i11;
        this.f46693c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46691a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46692b);
        w7.f0.c(parcel, 3, this.f46693c);
        w7.f0.r(parcel, q6);
    }
}
