package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f51909a;
    public final int f51910b;
    public final byte[] f51911c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f51909a = i10;
        this.f51910b = i11;
        this.f51911c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f51909a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51910b);
        w7.d0.c(parcel, 3, this.f51911c);
        w7.d0.r(parcel, q6);
    }
}
