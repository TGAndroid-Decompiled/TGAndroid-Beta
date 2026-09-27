package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f42468a;
    public String f42469b;
    public String f42470c;
    public int d;
    public Point[] e;
    public f f42471f;
    public i h;
    public j f42472n;
    public l f42473r;
    public k f42474s;
    public g v;
    public c f42475w;
    public d f42476x;
    public e f42477y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42468a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42469b);
        f0.l(parcel, 4, this.f42470c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f42471f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f42472n, i10);
        f0.k(parcel, 10, this.f42473r, i10);
        f0.k(parcel, 11, this.f42474s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f42475w, i10);
        f0.k(parcel, 14, this.f42476x, i10);
        f0.k(parcel, 15, this.f42477y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
