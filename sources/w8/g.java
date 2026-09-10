package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(23);
    public String f43860a;
    public String f43861b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43860a);
        e0.l(parcel, 3, this.f43861b);
        e0.r(parcel, q6);
    }
}
