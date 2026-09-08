package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f49673a;
    public final int f49674b;
    public final byte[] f49675c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f49673a = i10;
        this.f49674b = i11;
        this.f49675c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f49673a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49674b);
        w7.e0.c(parcel, 3, this.f49675c);
        w7.e0.r(parcel, q6);
    }
}
