package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f60533a;
    public String f60534b;
    public String f60535c;
    public String d;
    public String f60536e;
    public String f60537f;
    public String h;
    public String f60538n;
    public String f60539r;
    public boolean f60540s;
    public String f60541w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f60533a);
        yb.l(parcel, 3, this.f60534b);
        yb.l(parcel, 4, this.f60535c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f60536e);
        yb.l(parcel, 7, this.f60537f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.f60538n);
        yb.l(parcel, 10, this.f60539r);
        boolean z10 = this.f60540s;
        yb.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 12, this.f60541w);
        yb.s(parcel, r10);
    }
}
