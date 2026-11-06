package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(14);
    public String f59893a;
    public String f59894b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59893a);
        wb.l(parcel, 3, this.f59894b);
        wb.s(parcel, r10);
    }
}
