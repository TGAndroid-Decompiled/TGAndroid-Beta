package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f45019a;
    public String f45020b;
    public String f45021c;
    public int d;
    public Point[] f45022e;
    public f f45023f;
    public i h;
    public j f45024n;
    public l f45025r;
    public k f45026s;
    public g v;
    public c f45027w;
    public d f45028x;
    public e f45029y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f45019a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f45020b);
        e0.l(parcel, 4, this.f45021c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.f45022e, i10);
        e0.k(parcel, 7, this.f45023f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f45024n, i10);
        e0.k(parcel, 10, this.f45025r, i10);
        e0.k(parcel, 11, this.f45026s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f45027w, i10);
        e0.k(parcel, 14, this.f45028x, i10);
        e0.k(parcel, 15, this.f45029y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
