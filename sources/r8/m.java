package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42165a;
    public String f42166b;
    public String f42167c;
    public int d;
    public Point[] e;
    public f f42168f;
    public i h;
    public j f42169n;
    public l f42170r;
    public k f42171s;
    public g v;
    public c f42172w;
    public d f42173x;
    public e f42174y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f42165a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f42166b);
        e0.l(parcel, 4, this.f42167c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f42168f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f42169n, i10);
        e0.k(parcel, 10, this.f42170r, i10);
        e0.k(parcel, 11, this.f42171s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f42172w, i10);
        e0.k(parcel, 14, this.f42173x, i10);
        e0.k(parcel, 15, this.f42174y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
