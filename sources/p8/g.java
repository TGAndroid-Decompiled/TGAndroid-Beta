package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(21);
    public final String f53386a;

    public g(String str) {
        this.f53386a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f53386a);
        wb.s(parcel, r10);
    }
}
