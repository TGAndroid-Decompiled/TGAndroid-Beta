package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f56304a;
    public int f56305b;
    public int f56306c;
    public int d;
    public int f56307e;
    public int f56308f;
    public boolean h;
    public String f56309n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56304a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f56305b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f56306c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f56307e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f56308f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z9 = this.h;
        wb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 9, this.f56309n);
        wb.s(parcel, r10);
    }
}
