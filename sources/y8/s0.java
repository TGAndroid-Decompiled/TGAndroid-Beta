package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f46668a;
    public final int f46669b;
    public final byte[] f46670c;

    public s0(int i10, int i11, byte[] bArr) {
        this.f46668a = i10;
        this.f46669b = i11;
        this.f46670c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46668a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46669b);
        w7.f0.c(parcel, 3, this.f46670c);
        w7.f0.r(parcel, q6);
    }
}
