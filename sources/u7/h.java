package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new u6.p(4);
    public final boolean f45187a;
    public final boolean f45188b;
    public final boolean f45189c;
    public final boolean d;
    public final boolean e;
    public final boolean f45190f;

    public h(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f45187a = z4;
        this.f45188b = z10;
        this.f45189c = z11;
        this.d = z12;
        this.e = z13;
        this.f45190f = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f45187a ? 1 : 0);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45188b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f45189c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f45190f ? 1 : 0);
        f5.r(parcel, q10);
    }
}
