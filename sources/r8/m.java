package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.n(7);
    public e D;
    public byte[] E;
    public boolean F;
    public int f46420a;
    public String f46421b;
    public String f46422c;
    public int d;
    public Point[] e;
    public f f46423f;
    public i h;
    public j f46424n;
    public l f46425r;
    public k f46426s;
    public g f46427w;
    public c f46428x;
    public d f46429y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f46420a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.f46421b);
        h0.l(parcel, 4, this.f46422c);
        int i12 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        h0.o(parcel, 6, this.e, i10);
        h0.k(parcel, 7, this.f46423f, i10);
        h0.k(parcel, 8, this.h, i10);
        h0.k(parcel, 9, this.f46424n, i10);
        h0.k(parcel, 10, this.f46425r, i10);
        h0.k(parcel, 11, this.f46426s, i10);
        h0.k(parcel, 12, this.f46427w, i10);
        h0.k(parcel, 13, this.f46428x, i10);
        h0.k(parcel, 14, this.f46429y, i10);
        h0.k(parcel, 15, this.D, i10);
        h0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        h0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.r(parcel, q6);
    }
}
