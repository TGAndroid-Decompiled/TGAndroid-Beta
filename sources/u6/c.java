package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f58432a;
    public final boolean f58433b;

    public c(int i7, boolean z10) {
        this.f58432a = i7;
        this.f58433b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f58432a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f58433b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
