package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42528a;
    public String f42529b;
    public String f42530c;
    public int d;
    public Point[] e;
    public f f42531f;
    public i h;
    public j f42532n;
    public l f42533r;
    public k f42534s;
    public g v;
    public c f42535w;
    public d f42536x;
    public e f42537y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42528a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42529b);
        f0.l(parcel, 4, this.f42530c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f42531f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f42532n, i10);
        f0.k(parcel, 10, this.f42533r, i10);
        f0.k(parcel, 11, this.f42534s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f42535w, i10);
        f0.k(parcel, 14, this.f42536x, i10);
        f0.k(parcel, 15, this.f42537y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
