package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(18);
    public final String f53382a;

    public e(String str) {
        this.f53382a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f53382a);
        wb.s(parcel, r10);
    }
}
