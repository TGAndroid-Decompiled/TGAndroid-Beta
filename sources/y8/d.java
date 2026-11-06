package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f59169a;
    public String f59170b;
    public int f59171c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59169a);
        xb.l(parcel, 3, this.f59170b);
        int i10 = this.f59171c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.s(parcel, r10);
    }
}
