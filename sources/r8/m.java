package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f44018a;
    public String f44019b;
    public String f44020c;
    public int d;
    public Point[] e;
    public f f44021f;
    public i h;
    public j f44022n;
    public l f44023r;
    public k f44024s;
    public g v;
    public c f44025w;
    public d f44026x;
    public e f44027y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f44018a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f44019b);
        g0.l(parcel, 4, this.f44020c);
        int i12 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g0.o(parcel, 6, this.e, i10);
        g0.k(parcel, 7, this.f44021f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.k(parcel, 9, this.f44022n, i10);
        g0.k(parcel, 10, this.f44023r, i10);
        g0.k(parcel, 11, this.f44024s, i10);
        g0.k(parcel, 12, this.v, i10);
        g0.k(parcel, 13, this.f44025w, i10);
        g0.k(parcel, 14, this.f44026x, i10);
        g0.k(parcel, 15, this.f44027y, i10);
        g0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
