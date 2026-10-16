package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f48660a;
    public final int f48661b;
    public final byte[] f48662c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f48660a = i10;
        this.f48661b = i11;
        this.f48662c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f48660a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48661b);
        w7.f0.c(parcel, 3, this.f48662c);
        w7.f0.r(parcel, q6);
    }
}
