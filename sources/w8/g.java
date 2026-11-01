package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(20);
    public String f52782a;
    public String f52783b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52782a);
        h0.l(parcel, 3, this.f52783b);
        h0.r(parcel, q6);
    }
}
