package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(19);
    public String f51695a;
    public String f51696b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51695a);
        df.l(parcel, 3, this.f51696b);
        df.r(parcel, q5);
    }
}
