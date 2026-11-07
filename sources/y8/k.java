package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f59213a;
    public String f59214b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f59213a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f59214b);
        xb.s(parcel, r10);
    }
}
