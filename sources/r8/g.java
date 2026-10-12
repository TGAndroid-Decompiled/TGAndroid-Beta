package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double f47284a;
    public double f47285b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        double d = this.f47284a;
        c0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f47285b;
        c0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        c0.r(parcel, q6);
    }
}
