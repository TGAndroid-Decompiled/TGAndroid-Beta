package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.List;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int f53806a;
    public List f53807b;

    public p(int i7, List list) {
        this.f53806a = i7;
        this.f53807b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53806a);
        wb.p(parcel, 2, this.f53807b);
        wb.s(parcel, r10);
    }
}
