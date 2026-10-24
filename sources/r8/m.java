package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f45530a;
    public String f45531b;
    public String f45532c;
    public int d;
    public Point[] e;
    public f f45533f;
    public i h;
    public j f45534n;
    public l f45535r;
    public k f45536s;
    public g v;
    public c f45537w;
    public d f45538x;
    public e f45539y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45530a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45531b);
        f0.l(parcel, 4, this.f45532c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f45533f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f45534n, i10);
        f0.k(parcel, 10, this.f45535r, i10);
        f0.k(parcel, 11, this.f45536s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f45537w, i10);
        f0.k(parcel, 14, this.f45538x, i10);
        f0.k(parcel, 15, this.f45539y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
