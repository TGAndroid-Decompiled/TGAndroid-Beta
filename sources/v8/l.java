package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.n(28);
    public int f50715a;
    public Bundle f50716b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f50715a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.b(parcel, 3, this.f50716b);
        h0.r(parcel, q6);
    }
}
