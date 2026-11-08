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
    public int f56439a;
    public String f56440b;
    public String f56441c;
    public int d;
    public Point[] f56442e;
    public f f56443f;
    public i h;
    public j f56444n;
    public l f56445r;
    public k f56446s;
    public g f56447w;
    public c f56448x;
    public d f56449y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56439a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56440b);
        xb.l(parcel, 4, this.f56441c);
        int i11 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        xb.o(parcel, 6, this.f56442e, i7);
        xb.k(parcel, 7, this.f56443f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f56444n, i7);
        xb.k(parcel, 10, this.f56445r, i7);
        xb.k(parcel, 11, this.f56446s, i7);
        xb.k(parcel, 12, this.f56447w, i7);
        xb.k(parcel, 13, this.f56448x, i7);
        xb.k(parcel, 14, this.f56449y, i7);
        xb.k(parcel, 15, this.D, i7);
        xb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        xb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
