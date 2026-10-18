package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.m(8);
    public byte[] E;
    public boolean F;
    public int f45107a;
    public String f45108b;
    public String f45109c;
    public int d;
    public Point[] e;
    public f f45110f;
    public i h;
    public j f45111n;
    public l f45112r;
    public k f45113s;
    public g v;
    public c f45114w;
    public d f45115x;
    public e f45116y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f45107a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f45108b);
        f0.l(parcel, 4, this.f45109c);
        int i12 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f0.o(parcel, 6, this.e, i10);
        f0.k(parcel, 7, this.f45110f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.k(parcel, 9, this.f45111n, i10);
        f0.k(parcel, 10, this.f45112r, i10);
        f0.k(parcel, 11, this.f45113s, i10);
        f0.k(parcel, 12, this.v, i10);
        f0.k(parcel, 13, this.f45114w, i10);
        f0.k(parcel, 14, this.f45115x, i10);
        f0.k(parcel, 15, this.f45116y, i10);
        f0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.r(parcel, q6);
    }
}
