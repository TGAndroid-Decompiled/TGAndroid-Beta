package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(12);
    public String f59889a;
    public String f59890b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59889a);
        wb.l(parcel, 3, this.f59890b);
        wb.s(parcel, r10);
    }
}
