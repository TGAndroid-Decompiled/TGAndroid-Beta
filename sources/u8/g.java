package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f58540a;
    public double f58541b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        double d = this.f58540a;
        bc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f58541b;
        bc.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        bc.s(parcel, r10);
    }
}
