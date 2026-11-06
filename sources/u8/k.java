package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f56345a;
    public String f56346b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56345a);
        wb.l(parcel, 3, this.f56346b);
        wb.s(parcel, r10);
    }
}
