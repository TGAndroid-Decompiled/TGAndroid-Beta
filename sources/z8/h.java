package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f59920a;
    public String f59921b;
    public f f59922c;
    public g d;
    public g f59923e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59920a);
        wb.l(parcel, 3, this.f59921b);
        wb.k(parcel, 4, this.f59922c, i7);
        wb.k(parcel, 5, this.d, i7);
        wb.k(parcel, 6, this.f59923e, i7);
        wb.s(parcel, r10);
    }
}
