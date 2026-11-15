package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f60523a;
    public Bundle f60524b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f60523a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.b(parcel, 3, this.f60524b);
        yb.s(parcel, r10);
    }
}
