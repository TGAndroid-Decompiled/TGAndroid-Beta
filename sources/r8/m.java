package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42409a;
    public String f42410b;
    public String f42411c;
    public int d;
    public Point[] e;
    public f f42412f;
    public i h;
    public j f42413n;
    public l f42414r;
    public k f42415s;
    public g v;
    public c f42416w;
    public d f42417x;
    public e f42418y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42409a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42410b);
        f0.l(parcel, 4, this.f42411c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f42412f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f42413n, i10);
        f0.k(parcel, 10, this.f42414r, i10);
        f0.k(parcel, 11, this.f42415s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f42416w, i10);
        f0.k(parcel, 14, this.f42417x, i10);
        f0.k(parcel, 15, this.f42418y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
