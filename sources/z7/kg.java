package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends o6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f55001a;
    public final boolean f55002b;
    public final boolean f55003c;
    public final boolean d;
    public final boolean e;

    public kg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f55001a = z10;
        this.f55002b = z11;
        this.f55003c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f55001a ? 1 : 0);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f55002b ? 1 : 0);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f55003c ? 1 : 0);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}
