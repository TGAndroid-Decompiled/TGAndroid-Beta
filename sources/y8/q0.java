package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends o6.a {
    public static final Parcelable.Creator<q0> CREATOR = new l0(5);
    public final int f54267a;
    public final int f54268b;
    public final byte[] f54269c;

    public q0(int i10, int i11, byte[] bArr) {
        this.f54267a = i10;
        this.f54268b = i11;
        this.f54269c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54267a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54268b);
        w7.h0.c(parcel, 3, this.f54269c);
        w7.h0.r(parcel, q6);
    }
}
