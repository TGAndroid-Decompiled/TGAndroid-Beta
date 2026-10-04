package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45927a;
    public String f45928b;
    public String f45929c;
    public int d;
    public Point[] f45930e;
    public f f45931f;
    public i h;
    public j f45932n;
    public l f45933r;
    public k f45934s;
    public g v;
    public c f45935w;
    public d f45936x;
    public e f45937y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45927a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45928b);
        g0.l(parcel, 4, this.f45929c);
        int i12 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g0.o(parcel, 6, this.f45930e, i10);
        g0.k(parcel, 7, this.f45931f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.k(parcel, 9, this.f45932n, i10);
        g0.k(parcel, 10, this.f45933r, i10);
        g0.k(parcel, 11, this.f45934s, i10);
        g0.k(parcel, 12, this.v, i10);
        g0.k(parcel, 13, this.f45935w, i10);
        g0.k(parcel, 14, this.f45936x, i10);
        g0.k(parcel, 15, this.f45937y, i10);
        g0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
