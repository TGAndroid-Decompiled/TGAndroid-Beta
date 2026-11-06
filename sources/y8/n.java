package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int f59213a;
    public String f59214b;
    public String f59215c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59213a;
        wb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 2, this.f59214b);
        wb.l(parcel, 3, this.f59215c);
        wb.s(parcel, r10);
    }
}
