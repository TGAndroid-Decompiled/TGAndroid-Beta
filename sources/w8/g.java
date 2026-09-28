package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(23);
    public String f45182a;
    public String f45183b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45182a);
        f0.l(parcel, 3, this.f45183b);
        f0.r(parcel, q6);
    }
}
