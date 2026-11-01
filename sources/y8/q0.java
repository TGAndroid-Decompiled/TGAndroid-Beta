package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends o6.a {
    public static final Parcelable.Creator<q0> CREATOR = new l0(5);
    public final int f54288a;
    public final int f54289b;
    public final byte[] f54290c;

    public q0(int i10, int i11, byte[] bArr) {
        this.f54288a = i10;
        this.f54289b = i11;
        this.f54290c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54288a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54289b);
        w7.h0.c(parcel, 3, this.f54290c);
        w7.h0.r(parcel, q6);
    }
}
