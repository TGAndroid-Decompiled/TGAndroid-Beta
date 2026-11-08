package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f59305a;
    public Bundle f59306b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f59305a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.b(parcel, 3, this.f59306b);
        xb.s(parcel, r10);
    }
}
