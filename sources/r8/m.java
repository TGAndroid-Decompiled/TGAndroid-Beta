package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f45118a;
    public String f45119b;
    public String f45120c;
    public int d;
    public Point[] e;
    public f f45121f;
    public i h;
    public j f45122n;
    public l f45123r;
    public k f45124s;
    public g v;
    public c f45125w;
    public d f45126x;
    public e f45127y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45118a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45119b);
        f0.l(parcel, 4, this.f45120c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f45121f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f45122n, i10);
        f0.k(parcel, 10, this.f45123r, i10);
        f0.k(parcel, 11, this.f45124s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f45125w, i10);
        f0.k(parcel, 14, this.f45126x, i10);
        f0.k(parcel, 15, this.f45127y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
