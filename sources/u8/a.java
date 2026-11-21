package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(0);
    public int f58508a;
    public String[] f58509b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58508a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.m(parcel, 3, this.f58509b);
        bc.s(parcel, r10);
    }
}
