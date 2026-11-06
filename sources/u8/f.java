package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f56306a;
    public String f56307b;
    public String f56308c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56306a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f56307b);
        wb.l(parcel, 4, this.f56308c);
        wb.l(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
