package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new o(9);
    public String f56343a;
    public String f56344b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56343a);
        wb.l(parcel, 3, this.f56344b);
        wb.s(parcel, r10);
    }
}
