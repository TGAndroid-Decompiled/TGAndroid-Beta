package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends o6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f54187a;
    public final boolean f54188b;
    public final boolean f54189c;
    public final boolean d;
    public final boolean f54190e;

    public kg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f54187a = z10;
        this.f54188b = z11;
        this.f54189c = z12;
        this.d = z13;
        this.f54190e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f54187a ? 1 : 0);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f54188b ? 1 : 0);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f54189c ? 1 : 0);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f54190e ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
