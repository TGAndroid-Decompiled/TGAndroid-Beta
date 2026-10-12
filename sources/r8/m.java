package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f47308a;
    public String f47309b;
    public String f47310c;
    public int d;
    public Point[] f47311e;
    public f f47312f;
    public i h;
    public j f47313n;
    public l f47314r;
    public k f47315s;
    public g v;
    public c f47316w;
    public d f47317x;
    public e f47318y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f47308a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 3, this.f47309b);
        c0.l(parcel, 4, this.f47310c);
        int i12 = this.d;
        c0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        c0.o(parcel, 6, this.f47311e, i10);
        c0.k(parcel, 7, this.f47312f, i10);
        c0.k(parcel, 8, this.h, i10);
        c0.k(parcel, 9, this.f47313n, i10);
        c0.k(parcel, 10, this.f47314r, i10);
        c0.k(parcel, 11, this.f47315s, i10);
        c0.k(parcel, 12, this.v, i10);
        c0.k(parcel, 13, this.f47316w, i10);
        c0.k(parcel, 14, this.f47317x, i10);
        c0.k(parcel, 15, this.f47318y, i10);
        c0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        c0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.r(parcel, q6);
    }
}
