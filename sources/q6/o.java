package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f55368a;
    public final boolean f55369b;
    public final boolean f55370c;
    public final int d;
    public final int f55371e;

    public o(int i7, int i10, int i11, boolean z10, boolean z11) {
        this.f55368a = i7;
        this.f55369b = z10;
        this.f55370c = z11;
        this.d = i10;
        this.f55371e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55368a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f55369b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f55370c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f55371e);
        yb.s(parcel, r10);
    }
}
