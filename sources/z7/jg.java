package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f52804a;
    public final boolean f52805b;
    public final boolean f52806c;
    public final boolean d;
    public final boolean f52807e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f52804a = z10;
        this.f52805b = z11;
        this.f52806c = z12;
        this.d = z13;
        this.f52807e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f52804a ? 1 : 0);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f52805b ? 1 : 0);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f52806c ? 1 : 0);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f52807e ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
