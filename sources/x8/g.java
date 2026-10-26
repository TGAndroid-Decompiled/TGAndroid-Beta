package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(21);
    public String f51699a;
    public String f51700b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51699a);
        df.l(parcel, 3, this.f51700b);
        df.r(parcel, q5);
    }
}
