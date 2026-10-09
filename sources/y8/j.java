package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f51784a;
    public final boolean f51785b;
    public final boolean f51786c;
    public final boolean d;
    public final boolean f51787e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f51784a = i10;
        this.f51785b = z10;
        this.f51786c = z11;
        this.d = z12;
        this.f51787e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f51784a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51785b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51786c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f51787e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
