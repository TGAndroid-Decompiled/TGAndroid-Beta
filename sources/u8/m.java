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
    public int f58556a;
    public String f58557b;
    public String f58558c;
    public int d;
    public Point[] f58559e;
    public f f58560f;
    public i h;
    public j f58561n;
    public l f58562r;
    public k f58563s;
    public g f58564w;
    public c f58565x;
    public d f58566y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58556a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f58557b);
        bc.l(parcel, 4, this.f58558c);
        int i11 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        bc.o(parcel, 6, this.f58559e, i7);
        bc.k(parcel, 7, this.f58560f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f58561n, i7);
        bc.k(parcel, 10, this.f58562r, i7);
        bc.k(parcel, 11, this.f58563s, i7);
        bc.k(parcel, 12, this.f58564w, i7);
        bc.k(parcel, 13, this.f58565x, i7);
        bc.k(parcel, 14, this.f58566y, i7);
        bc.k(parcel, 15, this.E, i7);
        bc.c(parcel, 16, this.F);
        boolean z10 = this.G;
        bc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
