package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e E;
    public byte[] F;
    public boolean G;
    public int f57949a;
    public String f57950b;
    public String f57951c;
    public int d;
    public Point[] f57952e;
    public f f57953f;
    public i h;
    public j f57954n;
    public l f57955r;
    public k f57956s;
    public g f57957w;
    public c f57958x;
    public d f57959y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57949a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f57950b);
        yb.l(parcel, 4, this.f57951c);
        int i11 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        yb.o(parcel, 6, this.f57952e, i7);
        yb.k(parcel, 7, this.f57953f, i7);
        yb.k(parcel, 8, this.h, i7);
        yb.k(parcel, 9, this.f57954n, i7);
        yb.k(parcel, 10, this.f57955r, i7);
        yb.k(parcel, 11, this.f57956s, i7);
        yb.k(parcel, 12, this.f57957w, i7);
        yb.k(parcel, 13, this.f57958x, i7);
        yb.k(parcel, 14, this.f57959y, i7);
        yb.k(parcel, 15, this.E, i7);
        yb.c(parcel, 16, this.F);
        boolean z10 = this.G;
        yb.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.s(parcel, r10);
    }
}
