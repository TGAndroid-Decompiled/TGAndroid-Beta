package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46436a;
    public final int f46437b;
    public final byte[] f46438c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46436a = i10;
        this.f46437b = i11;
        this.f46438c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f46436a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46437b);
        w7.e0.c(parcel, 3, this.f46438c);
        w7.e0.r(parcel, q6);
    }
}
