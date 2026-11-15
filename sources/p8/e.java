package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(18);
    public final String f54917a;

    public e(String str) {
        this.f54917a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f54917a);
        yb.s(parcel, r10);
    }
}
