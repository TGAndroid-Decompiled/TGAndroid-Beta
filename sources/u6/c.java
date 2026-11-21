package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f58473a;
    public final boolean f58474b;

    public c(int i7, boolean z10) {
        this.f58473a = i7;
        this.f58474b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f58473a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f58474b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
