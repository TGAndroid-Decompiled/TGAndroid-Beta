package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42393a;
    public String f42394b;
    public String f42395c;
    public int d;
    public Point[] e;
    public f f42396f;
    public i h;
    public j f42397n;
    public l f42398r;
    public k f42399s;
    public g v;
    public c f42400w;
    public d f42401x;
    public e f42402y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42393a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42394b);
        f0.l(parcel, 4, this.f42395c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f42396f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f42397n, i10);
        f0.k(parcel, 10, this.f42398r, i10);
        f0.k(parcel, 11, this.f42399s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f42400w, i10);
        f0.k(parcel, 14, this.f42401x, i10);
        f0.k(parcel, 15, this.f42402y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
