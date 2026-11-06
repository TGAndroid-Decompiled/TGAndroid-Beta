package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f56334a;
    public double f56335b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        double d = this.f56334a;
        wb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f56335b;
        wb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        wb.s(parcel, r10);
    }
}
