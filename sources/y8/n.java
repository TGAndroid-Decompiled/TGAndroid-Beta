package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int f61133a;
    public String f61134b;
    public String f61135c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f61133a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 2, this.f61134b);
        bc.l(parcel, 3, this.f61135c);
        bc.s(parcel, r10);
    }
}
