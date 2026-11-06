package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new u8.o(24);
    public ArrayList f59187a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.n(parcel, 1, this.f59187a);
        wb.s(parcel, r10);
    }
}
