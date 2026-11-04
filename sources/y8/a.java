package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new w8.b(23);
    public String f59324a;
    public String f59325b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59324a);
        j8.a.m(parcel, 3, this.f59325b);
        j8.a.t(parcel, s6);
    }
}
