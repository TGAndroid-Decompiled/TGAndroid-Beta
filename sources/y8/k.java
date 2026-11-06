package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f59208a;
    public String f59209b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59208a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f59209b);
        wb.s(parcel, r10);
    }
}
