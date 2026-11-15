package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f60483a;
    public String f60484b;
    public int f60485c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f60483a);
        yb.l(parcel, 3, this.f60484b);
        int i10 = this.f60485c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.s(parcel, r10);
    }
}
