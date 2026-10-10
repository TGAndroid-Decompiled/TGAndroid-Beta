package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f53981a;
    public final boolean f53982b;
    public final boolean f53983c;
    public final boolean d;
    public final boolean f53984e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f53981a = z10;
        this.f53982b = z11;
        this.f53983c = z12;
        this.d = z13;
        this.f53984e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53981a ? 1 : 0);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53982b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53983c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f53984e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
