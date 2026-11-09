package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e D;
    public byte[] E;
    public boolean F;
    public int f56451a;
    public String f56452b;
    public String f56453c;
    public int d;
    public Point[] f56454e;
    public f f56455f;
    public i h;
    public j f56456n;
    public l f56457r;
    public k f56458s;
    public g f56459w;
    public c f56460x;
    public d f56461y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56451a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56452b);
        xb.l(parcel, 4, this.f56453c);
        int i11 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        xb.o(parcel, 6, this.f56454e, i7);
        xb.k(parcel, 7, this.f56455f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f56456n, i7);
        xb.k(parcel, 10, this.f56457r, i7);
        xb.k(parcel, 11, this.f56458s, i7);
        xb.k(parcel, 12, this.f56459w, i7);
        xb.k(parcel, 13, this.f56460x, i7);
        xb.k(parcel, 14, this.f56461y, i7);
        xb.k(parcel, 15, this.D, i7);
        xb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        xb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
