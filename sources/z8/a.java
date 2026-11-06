package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(8);
    public String f59876a;
    public String f59877b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59876a);
        wb.l(parcel, 3, this.f59877b);
        wb.s(parcel, r10);
    }
}
