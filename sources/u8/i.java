package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int f56442a;
    public String f56443b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56442a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56443b);
        xb.s(parcel, r10);
    }
}
