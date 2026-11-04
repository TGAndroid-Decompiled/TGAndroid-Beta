package t8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new q8.i(19);
    public int f55010a;
    public String f55011b;
    public String f55012c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f55010a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f55011b);
        j8.a.m(parcel, 4, this.f55012c);
        j8.a.m(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
