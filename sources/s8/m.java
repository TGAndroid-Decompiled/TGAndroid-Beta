package s8;

import a8.df;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new q7.m(9);
    public byte[] E;
    public boolean F;
    public int f47972a;
    public String f47973b;
    public String f47974c;
    public int d;
    public Point[] e;
    public f f47975f;
    public i h;
    public j f47976n;
    public l f47977r;
    public k f47978s;
    public g v;
    public c f47979w;
    public d f47980x;
    public e f47981y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47972a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f47973b);
        df.l(parcel, 4, this.f47974c);
        int i12 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i12);
        df.o(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f47975f, i10);
        df.k(parcel, 8, this.h, i10);
        df.k(parcel, 9, this.f47976n, i10);
        df.k(parcel, 10, this.f47977r, i10);
        df.k(parcel, 11, this.f47978s, i10);
        df.k(parcel, 12, this.v, i10);
        df.k(parcel, 13, this.f47979w, i10);
        df.k(parcel, 14, this.f47980x, i10);
        df.k(parcel, 15, this.f47981y, i10);
        df.c(parcel, 16, this.E);
        boolean z10 = this.F;
        df.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
