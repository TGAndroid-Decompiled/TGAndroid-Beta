package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45934a;
    public String f45935b;
    public String f45936c;
    public int d;
    public Point[] f45937e;
    public f f45938f;
    public i h;
    public j f45939n;
    public l f45940r;
    public k f45941s;
    public g v;
    public c f45942w;
    public d f45943x;
    public e f45944y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45934a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45935b);
        g0.l(parcel, 4, this.f45936c);
        int i12 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g0.o(parcel, 6, this.f45937e, i10);
        g0.k(parcel, 7, this.f45938f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.k(parcel, 9, this.f45939n, i10);
        g0.k(parcel, 10, this.f45940r, i10);
        g0.k(parcel, 11, this.f45941s, i10);
        g0.k(parcel, 12, this.v, i10);
        g0.k(parcel, 13, this.f45942w, i10);
        g0.k(parcel, 14, this.f45943x, i10);
        g0.k(parcel, 15, this.f45944y, i10);
        g0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
