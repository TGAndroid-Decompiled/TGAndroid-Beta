package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int f58551a;
    public String f58552b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58551a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f58552b);
        bc.s(parcel, r10);
    }
}
