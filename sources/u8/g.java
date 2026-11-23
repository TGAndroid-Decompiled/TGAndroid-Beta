package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double f58624a;
    public double f58625b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        double d = this.f58624a;
        cc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f58625b;
        cc.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        cc.s(parcel, r10);
    }
}
