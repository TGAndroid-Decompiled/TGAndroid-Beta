package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public String f59343a;
    public String f59344b;
    public f f59345c;
    public g d;
    public g f59346e;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59343a);
        j8.a.m(parcel, 3, this.f59344b);
        j8.a.l(parcel, 4, this.f59345c, i3);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.l(parcel, 6, this.f59346e, i3);
        j8.a.t(parcel, s6);
    }
}
