package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends p6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f52778a;
    public final int f52779b;
    public final byte[] f52780c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f52778a = i10;
        this.f52779b = i11;
        this.f52780c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52778a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52779b);
        df.c(parcel, 3, this.f52780c);
        df.r(parcel, q5);
    }
}
