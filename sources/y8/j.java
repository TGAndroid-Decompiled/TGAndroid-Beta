package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f54256a;
    public final boolean f54257b;
    public final boolean f54258c;
    public final boolean d;
    public final boolean e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f54256a = i10;
        this.f54257b = z10;
        this.f54258c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54256a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54257b ? 1 : 0);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54258c ? 1 : 0);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}
