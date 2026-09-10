package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int f41355a;
    public String f41356b;
    public String f41357c;
    public int d;
    public Point[] e;
    public f f41358f;
    public i h;
    public j f41359n;
    public l f41360r;
    public k f41361s;
    public g v;
    public c f41362w;
    public d f41363x;
    public e f41364y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f41355a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f41356b);
        e0.l(parcel, 4, this.f41357c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f41358f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.f41359n, i10);
        e0.k(parcel, 10, this.f41360r, i10);
        e0.k(parcel, 11, this.f41361s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.f41362w, i10);
        e0.k(parcel, 14, this.f41363x, i10);
        e0.k(parcel, 15, this.f41364y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
