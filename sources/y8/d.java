package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f59170a;
    public String f59171b;
    public int f59172c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59170a);
        wb.l(parcel, 3, this.f59171b);
        int i10 = this.f59172c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.s(parcel, r10);
    }
}
