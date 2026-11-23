package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new o(9);
    public String f58553a;
    public String f58554b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58553a);
        bc.l(parcel, 3, this.f58554b);
        bc.s(parcel, r10);
    }
}
