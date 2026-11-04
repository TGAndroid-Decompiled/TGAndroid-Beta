package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l extends q6.a {
    public static final Parcelable.Creator<l> CREATOR = new q8.i(25);
    public String f55026a;
    public String f55027b;
    public int f55028c;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f55026a);
        j8.a.m(parcel, 3, this.f55027b);
        int i10 = this.f55028c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.t(parcel, s6);
    }
}
