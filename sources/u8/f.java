package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f56419a;
    public String f56420b;
    public String f56421c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56419a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56420b);
        xb.l(parcel, 4, this.f56421c);
        xb.l(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
