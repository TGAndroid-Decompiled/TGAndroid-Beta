package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(12);
    public String f58551a;
    public String f58552b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58551a);
        bc.l(parcel, 3, this.f58552b);
        bc.s(parcel, r10);
    }
}
