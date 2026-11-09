package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f56435a;
    public double f56436b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        double d = this.f56435a;
        xb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f56436b;
        xb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        xb.s(parcel, r10);
    }
}
