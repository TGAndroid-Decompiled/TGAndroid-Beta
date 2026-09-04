package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f51132a;
    public final boolean f51133b;
    public final boolean f51134c;
    public final boolean d;
    public final boolean f51135e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f51132a = z10;
        this.f51133b = z11;
        this.f51134c = z12;
        this.d = z13;
        this.f51135e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f51132a ? 1 : 0);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f51133b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f51134c ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.f51135e ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
