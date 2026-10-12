package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(21);
    public String f47503a;
    public String f47504b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f47503a);
        g0.l(parcel, 3, this.f47504b);
        g0.r(parcel, q6);
    }
}
