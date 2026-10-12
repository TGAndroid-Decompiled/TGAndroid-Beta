package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f48661a;
    public final int f48662b;
    public final byte[] f48663c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f48661a = i10;
        this.f48662b = i11;
        this.f48663c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f48661a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48662b);
        w7.g0.c(parcel, 3, this.f48663c);
        w7.g0.r(parcel, q6);
    }
}
