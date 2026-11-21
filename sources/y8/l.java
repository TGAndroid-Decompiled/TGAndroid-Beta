package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f61130a;
    public Bundle f61131b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f61130a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.b(parcel, 3, this.f61131b);
        bc.s(parcel, r10);
    }
}
