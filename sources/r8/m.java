package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45919a;
    public String f45920b;
    public String f45921c;
    public int d;
    public Point[] f45922e;
    public f f45923f;
    public i h;
    public j f45924n;
    public l f45925r;
    public k f45926s;
    public g v;
    public c f45927w;
    public d f45928x;
    public e f45929y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45919a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45920b);
        g0.l(parcel, 4, this.f45921c);
        int i12 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g0.o(parcel, 6, this.f45922e, i10);
        g0.k(parcel, 7, this.f45923f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.k(parcel, 9, this.f45924n, i10);
        g0.k(parcel, 10, this.f45925r, i10);
        g0.k(parcel, 11, this.f45926s, i10);
        g0.k(parcel, 12, this.v, i10);
        g0.k(parcel, 13, this.f45927w, i10);
        g0.k(parcel, 14, this.f45928x, i10);
        g0.k(parcel, 15, this.f45929y, i10);
        g0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
