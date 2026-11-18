package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(21);
    public final String f55497a;

    public g(String str) {
        this.f55497a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f55497a);
        bc.s(parcel, r10);
    }
}
