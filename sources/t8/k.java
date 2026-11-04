package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new q8.i(26);
    public String f55024a;
    public String f55025b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f55024a);
        j8.a.m(parcel, 3, this.f55025b);
        j8.a.t(parcel, s6);
    }
}
