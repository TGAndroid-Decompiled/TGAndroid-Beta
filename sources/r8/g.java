package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double f47194a;
    public double f47195b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        double d = this.f47194a;
        d0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f47195b;
        d0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        d0.r(parcel, q6);
    }
}
