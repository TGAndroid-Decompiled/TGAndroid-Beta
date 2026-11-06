package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f59906a;
    public d f59907b;
    public f f59908c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59906a);
        wb.k(parcel, 3, this.f59907b, i7);
        wb.k(parcel, 5, this.f59908c, i7);
        wb.s(parcel, r10);
    }
}
