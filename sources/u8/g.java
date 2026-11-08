package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f56422a;
    public double f56423b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        double d = this.f56422a;
        xb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f56423b;
        xb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        xb.s(parcel, r10);
    }
}
