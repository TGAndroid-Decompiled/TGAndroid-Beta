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
    public int f58560a;
    public String f58561b;
    public String f58562c;
    public int d;
    public Point[] f58563e;
    public f f58564f;
    public i h;
    public j f58565n;
    public l f58566r;
    public k f58567s;
    public g f58568w;
    public c f58569x;
    public d f58570y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58560a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f58561b);
        bc.l(parcel, 4, this.f58562c);
        int i11 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        bc.o(parcel, 6, this.f58563e, i7);
        bc.k(parcel, 7, this.f58564f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f58565n, i7);
        bc.k(parcel, 10, this.f58566r, i7);
        bc.k(parcel, 11, this.f58567s, i7);
        bc.k(parcel, 12, this.f58568w, i7);
        bc.k(parcel, 13, this.f58569x, i7);
        bc.k(parcel, 14, this.f58570y, i7);
        bc.k(parcel, 15, this.E, i7);
        bc.c(parcel, 16, this.F);
        boolean z10 = this.G;
        bc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
