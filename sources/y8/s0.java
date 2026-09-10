package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46563a;
    public final int f46564b;
    public final byte[] f46565c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46563a = i10;
        this.f46564b = i11;
        this.f46565c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f46563a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46564b);
        w7.e0.c(parcel, 3, this.f46565c);
        w7.e0.r(parcel, q6);
    }
}
