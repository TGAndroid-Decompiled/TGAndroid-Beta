package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e D;
    public byte[] E;
    public boolean F;
    public int f56349a;
    public String f56350b;
    public String f56351c;
    public int d;
    public Point[] f56352e;
    public f f56353f;
    public i h;
    public j f56354n;
    public l f56355r;
    public k f56356s;
    public g f56357w;
    public c f56358x;
    public d f56359y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56349a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56350b);
        xb.l(parcel, 4, this.f56351c);
        int i11 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        xb.o(parcel, 6, this.f56352e, i7);
        xb.k(parcel, 7, this.f56353f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f56354n, i7);
        xb.k(parcel, 10, this.f56355r, i7);
        xb.k(parcel, 11, this.f56356s, i7);
        xb.k(parcel, 12, this.f56357w, i7);
        xb.k(parcel, 13, this.f56358x, i7);
        xb.k(parcel, 14, this.f56359y, i7);
        xb.k(parcel, 15, this.D, i7);
        xb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        xb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
