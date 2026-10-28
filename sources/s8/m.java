package s8;

import a8.df;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new q7.m(9);
    public byte[] E;
    public boolean F;
    public int f48007a;
    public String f48008b;
    public String f48009c;
    public int d;
    public Point[] e;
    public f f48010f;
    public i h;
    public j f48011n;
    public l f48012r;
    public k f48013s;
    public g v;
    public c f48014w;
    public d f48015x;
    public e f48016y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f48007a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f48008b);
        df.l(parcel, 4, this.f48009c);
        int i12 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i12);
        df.o(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f48010f, i10);
        df.k(parcel, 8, this.h, i10);
        df.k(parcel, 9, this.f48011n, i10);
        df.k(parcel, 10, this.f48012r, i10);
        df.k(parcel, 11, this.f48013s, i10);
        df.k(parcel, 12, this.v, i10);
        df.k(parcel, 13, this.f48014w, i10);
        df.k(parcel, 14, this.f48015x, i10);
        df.k(parcel, 15, this.f48016y, i10);
        df.c(parcel, 16, this.E);
        boolean z10 = this.F;
        df.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
