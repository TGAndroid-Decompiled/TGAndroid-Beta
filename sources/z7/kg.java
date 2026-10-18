package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends o6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f51080a;
    public final boolean f51081b;
    public final boolean f51082c;
    public final boolean d;
    public final boolean e;

    public kg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f51080a = z10;
        this.f51081b = z11;
        this.f51082c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f51080a ? 1 : 0);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f51081b ? 1 : 0);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f51082c ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
