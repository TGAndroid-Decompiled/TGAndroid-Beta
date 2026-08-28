package q7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new j(0);
    public final boolean f46104a;
    public final boolean f46105b;
    public final boolean f46106c;
    public final boolean d;
    public final boolean f46107e;
    public final boolean f46108f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f46104a = z10;
        this.f46105b = z11;
        this.f46106c = z12;
        this.d = z13;
        this.f46107e = z14;
        this.f46108f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f46104a ? 1 : 0);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f46105b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f46106c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f46107e ? 1 : 0);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f46108f ? 1 : 0);
        p8.r(parcel, q10);
    }
}
