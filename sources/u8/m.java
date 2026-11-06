package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e D;
    public byte[] E;
    public boolean F;
    public int f56350a;
    public String f56351b;
    public String f56352c;
    public int d;
    public Point[] f56353e;
    public f f56354f;
    public i h;
    public j f56355n;
    public l f56356r;
    public k f56357s;
    public g f56358w;
    public c f56359x;
    public d f56360y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56350a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f56351b);
        wb.l(parcel, 4, this.f56352c);
        int i11 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        wb.o(parcel, 6, this.f56353e, i7);
        wb.k(parcel, 7, this.f56354f, i7);
        wb.k(parcel, 8, this.h, i7);
        wb.k(parcel, 9, this.f56355n, i7);
        wb.k(parcel, 10, this.f56356r, i7);
        wb.k(parcel, 11, this.f56357s, i7);
        wb.k(parcel, 12, this.f56358w, i7);
        wb.k(parcel, 13, this.f56359x, i7);
        wb.k(parcel, 14, this.f56360y, i7);
        wb.k(parcel, 15, this.D, i7);
        wb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        wb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.s(parcel, r10);
    }
}
