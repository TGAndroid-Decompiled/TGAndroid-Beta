package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(18);
    public final String f55534a;

    public e(String str) {
        this.f55534a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f55534a);
        bc.s(parcel, r10);
    }
}
