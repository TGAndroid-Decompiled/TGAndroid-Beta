package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f55376a;
    public final String f55377b;
    public final long f55378c;
    public final int d;
    public final boolean f55379e;

    public r(int i7, int i10, long j3, String str, boolean z10) {
        this.f55376a = i7;
        this.f55377b = str;
        this.f55378c = j3;
        this.d = i10;
        this.f55379e = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55376a);
        yb.l(parcel, 2, this.f55377b);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f55378c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f55379e ? 1 : 0);
        yb.s(parcel, r10);
    }
}
