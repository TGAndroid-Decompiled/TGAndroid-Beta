package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new q7.m(17);
    public String f48000a;
    public String f48001b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f48000a);
        df.l(parcel, 3, this.f48001b);
        df.r(parcel, q5);
    }
}
