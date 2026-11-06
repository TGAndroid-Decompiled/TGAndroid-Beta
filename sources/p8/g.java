package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(21);
    public final String f53410a;

    public g(String str) {
        this.f53410a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53410a);
        xb.s(parcel, r10);
    }
}
