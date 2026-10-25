package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(15);
    public String f51680a;
    public String f51681b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51680a);
        df.l(parcel, 3, this.f51681b);
        df.r(parcel, q5);
    }
}
