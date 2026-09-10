package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double f41340a;
    public double f41341b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        double d = this.f41340a;
        e0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f41341b;
        e0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        e0.r(parcel, q6);
    }
}
