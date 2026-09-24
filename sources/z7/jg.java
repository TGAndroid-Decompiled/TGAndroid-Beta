package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f48774a;
    public final boolean f48775b;
    public final boolean f48776c;
    public final boolean d;
    public final boolean e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f48774a = z10;
        this.f48775b = z11;
        this.f48776c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f48774a ? 1 : 0);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48775b ? 1 : 0);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48776c ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
