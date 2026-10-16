package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f43777a;
    public String f43778b;
    public String f43779c;
    public int d;
    public Point[] e;
    public f f43780f;
    public i h;
    public j f43781n;
    public l f43782r;
    public k f43783s;
    public g v;
    public c f43784w;
    public d f43785x;
    public e f43786y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f43777a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f43778b);
        f0.l(parcel, 4, this.f43779c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f43780f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f43781n, i10);
        f0.k(parcel, 10, this.f43782r, i10);
        f0.k(parcel, 11, this.f43783s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f43784w, i10);
        f0.k(parcel, 14, this.f43785x, i10);
        f0.k(parcel, 15, this.f43786y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
