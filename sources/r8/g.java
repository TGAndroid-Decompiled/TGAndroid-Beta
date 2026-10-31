package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.n(14);
    public double f46394a;
    public double f46395b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        double d = this.f46394a;
        h0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f46395b;
        h0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        h0.r(parcel, q6);
    }
}
