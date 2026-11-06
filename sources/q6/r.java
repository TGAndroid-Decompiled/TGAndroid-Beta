package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f53834a;
    public final String f53835b;
    public final long f53836c;
    public final int d;
    public final boolean f53837e;

    public r(int i7, int i10, long j3, String str, boolean z9) {
        this.f53834a = i7;
        this.f53835b = str;
        this.f53836c = j3;
        this.d = i10;
        this.f53837e = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53834a);
        xb.l(parcel, 2, this.f53835b);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f53836c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53837e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
