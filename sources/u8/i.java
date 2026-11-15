package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int f57940a;
    public String f57941b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57940a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f57941b);
        yb.s(parcel, r10);
    }
}
