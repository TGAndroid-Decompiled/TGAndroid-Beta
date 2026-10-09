package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f53937a;
    public final boolean f53938b;
    public final boolean f53939c;
    public final boolean d;
    public final boolean f53940e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f53937a = z10;
        this.f53938b = z11;
        this.f53939c = z12;
        this.d = z13;
        this.f53940e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53937a ? 1 : 0);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53938b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53939c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f53940e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
