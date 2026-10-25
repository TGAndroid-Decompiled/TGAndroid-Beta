package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new q7.m(20);
    public String f47964a;
    public String f47965b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f47964a);
        df.l(parcel, 3, this.f47965b);
        df.r(parcel, q5);
    }
}
