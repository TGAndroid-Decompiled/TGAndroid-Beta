package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(21);
    public final String f54921a;

    public g(String str) {
        this.f54921a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f54921a);
        yb.s(parcel, r10);
    }
}
