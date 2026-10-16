package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(21);
    public String f47502a;
    public String f47503b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f47502a);
        f0.l(parcel, 3, this.f47503b);
        f0.r(parcel, q6);
    }
}
