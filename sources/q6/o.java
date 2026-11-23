package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f55952a;
    public final boolean f55953b;
    public final boolean f55954c;
    public final int d;
    public final int f55955e;

    public o(int i7, int i10, int i11, boolean z10, boolean z11) {
        this.f55952a = i7;
        this.f55953b = z10;
        this.f55954c = z11;
        this.d = i10;
        this.f55955e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55952a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f55953b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55954c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f55955e);
        cc.s(parcel, r10);
    }
}
