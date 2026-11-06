package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f59895a;
    public String f59896b;
    public f f59897c;
    public g d;
    public g f59898e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59895a);
        wb.l(parcel, 3, this.f59896b);
        wb.k(parcel, 4, this.f59897c, i7);
        wb.k(parcel, 5, this.d, i7);
        wb.k(parcel, 6, this.f59898e, i7);
        wb.s(parcel, r10);
    }
}
