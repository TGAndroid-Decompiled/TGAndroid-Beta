package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f56065a;
    public final boolean f56066b;
    public final boolean f56067c;
    public final int d;
    public final int f56068e;

    public o(int i7, int i10, int i11, boolean z10, boolean z11) {
        this.f56065a = i7;
        this.f56066b = z10;
        this.f56067c = z11;
        this.d = i10;
        this.f56068e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56065a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f56066b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f56067c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f56068e);
        cc.s(parcel, r10);
    }
}
