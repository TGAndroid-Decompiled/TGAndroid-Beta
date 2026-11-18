package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String f58512a;
    public String f58513b;
    public int f58514c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58512a);
        bc.l(parcel, 3, this.f58513b);
        int i10 = this.f58514c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.s(parcel, r10);
    }
}
