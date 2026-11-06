package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import y8.v;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(9);
    public String f59903a;
    public String f59904b;
    public ArrayList f59905c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59903a);
        wb.l(parcel, 3, this.f59904b);
        wb.p(parcel, 4, this.f59905c);
        wb.s(parcel, r10);
    }
}
