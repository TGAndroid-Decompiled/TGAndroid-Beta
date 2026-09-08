package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f49635a;
    public final boolean f49636b;
    public final boolean f49637c;
    public final boolean d;
    public final boolean f49638e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f49635a = i10;
        this.f49636b = z10;
        this.f49637c = z11;
        this.d = z12;
        this.f49638e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f49635a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49636b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49637c ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.f49638e ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
