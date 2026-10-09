package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f47086a;
    public String f47087b;
    public String f47088c;
    public int d;
    public Point[] f47089e;
    public f f47090f;
    public i h;
    public j f47091n;
    public l f47092r;
    public k f47093s;
    public g v;
    public c f47094w;
    public d f47095x;
    public e f47096y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47086a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f47087b);
        d0.l(parcel, 4, this.f47088c);
        int i12 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        d0.o(parcel, 6, this.f47089e, i10);
        d0.k(parcel, 7, this.f47090f, i10);
        d0.k(parcel, 8, this.h, i10);
        d0.k(parcel, 9, this.f47091n, i10);
        d0.k(parcel, 10, this.f47092r, i10);
        d0.k(parcel, 11, this.f47093s, i10);
        d0.k(parcel, 12, this.v, i10);
        d0.k(parcel, 13, this.f47094w, i10);
        d0.k(parcel, 14, this.f47095x, i10);
        d0.k(parcel, 15, this.f47096y, i10);
        d0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        d0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.r(parcel, q6);
    }
}
