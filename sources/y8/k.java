package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f59183a;
    public String f59184b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59183a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f59184b);
        wb.s(parcel, r10);
    }
}
