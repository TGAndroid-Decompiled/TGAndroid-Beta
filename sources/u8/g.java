package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f57933a;
    public double f57934b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        double d = this.f57933a;
        yb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f57934b;
        yb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        yb.s(parcel, r10);
    }
}
