package s8;

import a8.df;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new q7.m(9);
    public byte[] E;
    public boolean F;
    public int f47969a;
    public String f47970b;
    public String f47971c;
    public int d;
    public Point[] e;
    public f f47972f;
    public i h;
    public j f47973n;
    public l f47974r;
    public k f47975s;
    public g v;
    public c f47976w;
    public d f47977x;
    public e f47978y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47969a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f47970b);
        df.l(parcel, 4, this.f47971c);
        int i12 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i12);
        df.o(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f47972f, i10);
        df.k(parcel, 8, this.h, i10);
        df.k(parcel, 9, this.f47973n, i10);
        df.k(parcel, 10, this.f47974r, i10);
        df.k(parcel, 11, this.f47975s, i10);
        df.k(parcel, 12, this.v, i10);
        df.k(parcel, 13, this.f47976w, i10);
        df.k(parcel, 14, this.f47977x, i10);
        df.k(parcel, 15, this.f47978y, i10);
        df.c(parcel, 16, this.E);
        boolean z10 = this.F;
        df.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
