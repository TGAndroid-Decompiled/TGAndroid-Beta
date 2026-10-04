package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f52810a;
    public final boolean f52811b;
    public final boolean f52812c;
    public final boolean d;
    public final boolean f52813e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f52810a = z10;
        this.f52811b = z11;
        this.f52812c = z12;
        this.d = z13;
        this.f52813e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f52810a ? 1 : 0);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f52811b ? 1 : 0);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f52812c ? 1 : 0);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f52813e ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
