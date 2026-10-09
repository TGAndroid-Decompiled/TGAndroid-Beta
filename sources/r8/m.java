package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f47084a;
    public String f47085b;
    public String f47086c;
    public int d;
    public Point[] f47087e;
    public f f47088f;
    public i h;
    public j f47089n;
    public l f47090r;
    public k f47091s;
    public g v;
    public c f47092w;
    public d f47093x;
    public e f47094y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47084a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f47085b);
        d0.l(parcel, 4, this.f47086c);
        int i12 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        d0.o(parcel, 6, this.f47087e, i10);
        d0.k(parcel, 7, this.f47088f, i10);
        d0.k(parcel, 8, this.h, i10);
        d0.k(parcel, 9, this.f47089n, i10);
        d0.k(parcel, 10, this.f47090r, i10);
        d0.k(parcel, 11, this.f47091s, i10);
        d0.k(parcel, 12, this.v, i10);
        d0.k(parcel, 13, this.f47092w, i10);
        d0.k(parcel, 14, this.f47093x, i10);
        d0.k(parcel, 15, this.f47094y, i10);
        d0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        d0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.r(parcel, q6);
    }
}
