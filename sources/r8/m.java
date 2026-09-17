package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42160a;
    public String f42161b;
    public String f42162c;
    public int d;
    public Point[] e;
    public f f42163f;
    public i h;
    public j f42164n;
    public l f42165r;
    public k f42166s;
    public g v;
    public c f42167w;
    public d f42168x;
    public e f42169y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f42160a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f42161b);
        e0.l(parcel, 4, this.f42162c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f42163f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f42164n, i10);
        e0.k(parcel, 10, this.f42165r, i10);
        e0.k(parcel, 11, this.f42166s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f42167w, i10);
        e0.k(parcel, 14, this.f42168x, i10);
        e0.k(parcel, 15, this.f42169y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
