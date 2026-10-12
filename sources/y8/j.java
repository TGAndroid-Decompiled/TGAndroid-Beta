package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f52008a;
    public final boolean f52009b;
    public final boolean f52010c;
    public final boolean d;
    public final boolean f52011e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52008a = i10;
        this.f52009b = z10;
        this.f52010c = z11;
        this.d = z12;
        this.f52011e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f52008a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52009b ? 1 : 0);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52010c ? 1 : 0);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f52011e ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
