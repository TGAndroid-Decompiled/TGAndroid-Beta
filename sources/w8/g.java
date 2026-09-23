package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(23);
    public String f44851a;
    public String f44852b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44851a);
        e0.l(parcel, 3, this.f44852b);
        e0.r(parcel, q6);
    }
}
