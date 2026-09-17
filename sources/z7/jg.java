package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f51164a;
    public final boolean f51165b;
    public final boolean f51166c;
    public final boolean d;
    public final boolean f51167e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f51164a = z10;
        this.f51165b = z11;
        this.f51166c = z12;
        this.d = z13;
        this.f51167e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f51164a ? 1 : 0);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f51165b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f51166c ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.f51167e ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
