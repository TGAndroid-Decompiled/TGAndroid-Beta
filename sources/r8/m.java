package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45020a;
    public String f45021b;
    public String f45022c;
    public int d;
    public Point[] f45023e;
    public f f45024f;
    public i h;
    public j f45025n;
    public l f45026r;
    public k f45027s;
    public g v;
    public c f45028w;
    public d f45029x;
    public e f45030y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f45020a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f45021b);
        e0.l(parcel, 4, this.f45022c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.f45023e, i10);
        e0.k(parcel, 7, this.f45024f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f45025n, i10);
        e0.k(parcel, 10, this.f45026r, i10);
        e0.k(parcel, 11, this.f45027s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f45028w, i10);
        e0.k(parcel, 14, this.f45029x, i10);
        e0.k(parcel, 15, this.f45030y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
