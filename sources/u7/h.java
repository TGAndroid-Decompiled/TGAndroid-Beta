package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new u6.p(4);
    public final boolean f45249a;
    public final boolean f45250b;
    public final boolean f45251c;
    public final boolean d;
    public final boolean e;
    public final boolean f45252f;

    public h(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f45249a = z4;
        this.f45250b = z10;
        this.f45251c = z11;
        this.d = z12;
        this.e = z13;
        this.f45252f = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f45249a ? 1 : 0);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45250b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f45251c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f45252f ? 1 : 0);
        f5.r(parcel, q10);
    }
}
