package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new u6.p(4);
    public final boolean f48445a;
    public final boolean f48446b;
    public final boolean f48447c;
    public final boolean d;
    public final boolean f48448e;
    public final boolean f48449f;

    public h(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f48445a = z4;
        this.f48446b = z10;
        this.f48447c = z11;
        this.d = z12;
        this.f48448e = z13;
        this.f48449f = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f48445a ? 1 : 0);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f48446b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f48447c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f48448e ? 1 : 0);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f48449f ? 1 : 0);
        g5.r(parcel, q10);
    }
}
