package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new w8.b(26);
    public String f59329a;
    public d f59330b;
    public f f59331c;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59329a);
        j8.a.l(parcel, 3, this.f59330b, i3);
        j8.a.l(parcel, 5, this.f59331c, i3);
        j8.a.t(parcel, s6);
    }
}
