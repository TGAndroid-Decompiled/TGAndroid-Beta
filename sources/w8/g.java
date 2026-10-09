package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(23);
    public String f50204a;
    public String f50205b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50204a);
        d0.l(parcel, 3, this.f50205b);
        d0.r(parcel, q6);
    }
}
