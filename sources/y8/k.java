package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f61132a;
    public String f61133b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f61132a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f61133b);
        bc.s(parcel, r10);
    }
}
