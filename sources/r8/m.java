package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42134a;
    public String f42135b;
    public String f42136c;
    public int d;
    public Point[] e;
    public f f42137f;
    public i h;
    public j f42138n;
    public l f42139r;
    public k f42140s;
    public g v;
    public c f42141w;
    public d f42142x;
    public e f42143y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f42134a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f42135b);
        e0.l(parcel, 4, this.f42136c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f42137f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f42138n, i10);
        e0.k(parcel, 10, this.f42139r, i10);
        e0.k(parcel, 11, this.f42140s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f42141w, i10);
        e0.k(parcel, 14, this.f42142x, i10);
        e0.k(parcel, 15, this.f42143y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
