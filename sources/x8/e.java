package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(19);
    public String f51753a;
    public String f51754b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51753a);
        df.l(parcel, 3, this.f51754b);
        df.r(parcel, q5);
    }
}
