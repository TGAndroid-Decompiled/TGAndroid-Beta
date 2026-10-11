package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f51871a;
    public final boolean f51872b;
    public final boolean f51873c;
    public final boolean d;
    public final boolean f51874e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f51871a = i10;
        this.f51872b = z10;
        this.f51873c = z11;
        this.d = z12;
        this.f51874e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f51871a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51872b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51873c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f51874e ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
