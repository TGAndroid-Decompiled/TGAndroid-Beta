package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45047a;
    public String f45048b;
    public String f45049c;
    public int d;
    public Point[] f45050e;
    public f f45051f;
    public i h;
    public j f45052n;
    public l f45053r;
    public k f45054s;
    public g v;
    public c f45055w;
    public d f45056x;
    public e f45057y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f45047a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f45048b);
        e0.l(parcel, 4, this.f45049c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.f45050e, i10);
        e0.k(parcel, 7, this.f45051f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f45052n, i10);
        e0.k(parcel, 10, this.f45053r, i10);
        e0.k(parcel, 11, this.f45054s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f45055w, i10);
        e0.k(parcel, 14, this.f45056x, i10);
        e0.k(parcel, 15, this.f45057y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
