package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new q7.m(16);
    public double f47992a;
    public double f47993b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        double d = this.f47992a;
        df.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f47993b;
        df.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        df.r(parcel, q5);
    }
}
