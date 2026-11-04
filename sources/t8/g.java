package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new q8.i(22);
    public double f55013a;
    public double f55014b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        double d = this.f55013a;
        j8.a.r(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f55014b;
        j8.a.r(parcel, 3, 8);
        parcel.writeDouble(d10);
        j8.a.t(parcel, s6);
    }
}
