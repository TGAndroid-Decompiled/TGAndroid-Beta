package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String f56322a;
    public String f56323b;
    public int f56324c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56322a);
        wb.l(parcel, 3, this.f56323b);
        int i10 = this.f56324c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.s(parcel, r10);
    }
}
