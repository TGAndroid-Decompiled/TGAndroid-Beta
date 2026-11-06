package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String f56346a;
    public String f56347b;
    public int f56348c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56346a);
        xb.l(parcel, 3, this.f56347b);
        int i10 = this.f56348c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.s(parcel, r10);
    }
}
