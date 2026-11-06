package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f56279a;
    public int f56280b;
    public int f56281c;
    public int d;
    public int f56282e;
    public int f56283f;
    public boolean h;
    public String f56284n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56279a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f56280b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f56281c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f56282e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f56283f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z9 = this.h;
        wb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 9, this.f56284n);
        wb.s(parcel, r10);
    }
}
