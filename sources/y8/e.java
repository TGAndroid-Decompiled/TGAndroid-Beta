package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new w8.b(27);
    public String f59337a;
    public String f59338b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59337a);
        j8.a.m(parcel, 3, this.f59338b);
        j8.a.t(parcel, s6);
    }
}
