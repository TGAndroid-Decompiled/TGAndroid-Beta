package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45920a;
    public String f45921b;
    public String f45922c;
    public int d;
    public Point[] f45923e;
    public f f45924f;
    public i h;
    public j f45925n;
    public l f45926r;
    public k f45927s;
    public g v;
    public c f45928w;
    public d f45929x;
    public e f45930y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45920a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45921b);
        g0.l(parcel, 4, this.f45922c);
        int i12 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g0.o(parcel, 6, this.f45923e, i10);
        g0.k(parcel, 7, this.f45924f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.k(parcel, 9, this.f45925n, i10);
        g0.k(parcel, 10, this.f45926r, i10);
        g0.k(parcel, 11, this.f45927s, i10);
        g0.k(parcel, 12, this.v, i10);
        g0.k(parcel, 13, this.f45928w, i10);
        g0.k(parcel, 14, this.f45929x, i10);
        g0.k(parcel, 15, this.f45930y, i10);
        g0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
