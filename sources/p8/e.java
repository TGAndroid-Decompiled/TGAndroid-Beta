package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(18);
    public final String f53512a;

    public e(String str) {
        this.f53512a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53512a);
        xb.s(parcel, r10);
    }
}
