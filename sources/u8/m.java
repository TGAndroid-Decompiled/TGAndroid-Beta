package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e E;
    public byte[] F;
    public boolean G;
    public int f58514a;
    public String f58515b;
    public String f58516c;
    public int d;
    public Point[] f58517e;
    public f f58518f;
    public i h;
    public j f58519n;
    public l f58520r;
    public k f58521s;
    public g f58522w;
    public c f58523x;
    public d f58524y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58514a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f58515b);
        bc.l(parcel, 4, this.f58516c);
        int i11 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        bc.o(parcel, 6, this.f58517e, i7);
        bc.k(parcel, 7, this.f58518f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f58519n, i7);
        bc.k(parcel, 10, this.f58520r, i7);
        bc.k(parcel, 11, this.f58521s, i7);
        bc.k(parcel, 12, this.f58522w, i7);
        bc.k(parcel, 13, this.f58523x, i7);
        bc.k(parcel, 14, this.f58524y, i7);
        bc.k(parcel, 15, this.E, i7);
        bc.c(parcel, 16, this.F);
        boolean z10 = this.G;
        bc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
