package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f58509a;
    public String f58510b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58509a);
        bc.l(parcel, 3, this.f58510b);
        bc.s(parcel, r10);
    }
}
