package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.m(15);
    public double f43762a;
    public double f43763b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        double d = this.f43762a;
        f0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f43763b;
        f0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f0.r(parcel, q6);
    }
}
