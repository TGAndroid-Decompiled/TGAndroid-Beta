package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46681a;
    public final int f46682b;
    public final byte[] f46683c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46681a = i10;
        this.f46682b = i11;
        this.f46683c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46681a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46682b);
        w7.f0.c(parcel, 3, this.f46683c);
        w7.f0.r(parcel, q6);
    }
}
