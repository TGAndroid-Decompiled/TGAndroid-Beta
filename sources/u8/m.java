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
    public int f56438a;
    public String f56439b;
    public String f56440c;
    public int d;
    public Point[] f56441e;
    public f f56442f;
    public i h;
    public j f56443n;
    public l f56444r;
    public k f56445s;
    public g f56446w;
    public c f56447x;
    public d f56448y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56438a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56439b);
        xb.l(parcel, 4, this.f56440c);
        int i11 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        xb.o(parcel, 6, this.f56441e, i7);
        xb.k(parcel, 7, this.f56442f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f56443n, i7);
        xb.k(parcel, 10, this.f56444r, i7);
        xb.k(parcel, 11, this.f56445s, i7);
        xb.k(parcel, 12, this.f56446w, i7);
        xb.k(parcel, 13, this.f56447x, i7);
        xb.k(parcel, 14, this.f56448y, i7);
        xb.k(parcel, 15, this.D, i7);
        xb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        xb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
