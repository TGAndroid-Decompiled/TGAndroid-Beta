package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f60521a;
    public String f60522b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f60521a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f60522b);
        yb.s(parcel, r10);
    }
}
