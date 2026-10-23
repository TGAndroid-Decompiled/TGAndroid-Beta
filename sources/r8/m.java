package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f45119a;
    public String f45120b;
    public String f45121c;
    public int d;
    public Point[] e;
    public f f45122f;
    public i h;
    public j f45123n;
    public l f45124r;
    public k f45125s;
    public g v;
    public c f45126w;
    public d f45127x;
    public e f45128y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45119a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45120b);
        f0.l(parcel, 4, this.f45121c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f45122f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f45123n, i10);
        f0.k(parcel, 10, this.f45124r, i10);
        f0.k(parcel, 11, this.f45125s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f45126w, i10);
        f0.k(parcel, 14, this.f45127x, i10);
        f0.k(parcel, 15, this.f45128y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
