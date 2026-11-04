package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new w8.b(29);
    public String f59341a;
    public String f59342b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59341a);
        j8.a.m(parcel, 3, this.f59342b);
        j8.a.t(parcel, s6);
    }
}
