package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e E;
    public byte[] F;
    public boolean G;
    public int f58525a;
    public String f58526b;
    public String f58527c;
    public int d;
    public Point[] f58528e;
    public f f58529f;
    public i h;
    public j f58530n;
    public l f58531r;
    public k f58532s;
    public g f58533w;
    public c f58534x;
    public d f58535y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f58525a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f58526b);
        cc.l(parcel, 4, this.f58527c);
        int i11 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        cc.o(parcel, 6, this.f58528e, i7);
        cc.k(parcel, 7, this.f58529f, i7);
        cc.k(parcel, 8, this.h, i7);
        cc.k(parcel, 9, this.f58530n, i7);
        cc.k(parcel, 10, this.f58531r, i7);
        cc.k(parcel, 11, this.f58532s, i7);
        cc.k(parcel, 12, this.f58533w, i7);
        cc.k(parcel, 13, this.f58534x, i7);
        cc.k(parcel, 14, this.f58535y, i7);
        cc.k(parcel, 15, this.E, i7);
        cc.c(parcel, 16, this.F);
        boolean z10 = this.G;
        cc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.s(parcel, r10);
    }
}
