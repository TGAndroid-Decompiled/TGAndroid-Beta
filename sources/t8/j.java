package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new q8.i(23);
    public String f55022a;
    public String f55023b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f55022a);
        j8.a.m(parcel, 3, this.f55023b);
        j8.a.t(parcel, s6);
    }
}
