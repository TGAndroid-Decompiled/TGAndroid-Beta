package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f61094a;
    public String f61095b;
    public int f61096c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61094a);
        bc.l(parcel, 3, this.f61095b);
        int i10 = this.f61096c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.s(parcel, r10);
    }
}
