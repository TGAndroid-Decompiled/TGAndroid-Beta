package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f45133a;
    public String f45134b;
    public String f45135c;
    public int d;
    public Point[] e;
    public f f45136f;
    public i h;
    public j f45137n;
    public l f45138r;
    public k f45139s;
    public g v;
    public c f45140w;
    public d f45141x;
    public e f45142y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45133a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45134b);
        f0.l(parcel, 4, this.f45135c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f45136f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f45137n, i10);
        f0.k(parcel, 10, this.f45138r, i10);
        f0.k(parcel, 11, this.f45139s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f45140w, i10);
        f0.k(parcel, 14, this.f45141x, i10);
        f0.k(parcel, 15, this.f45142y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
