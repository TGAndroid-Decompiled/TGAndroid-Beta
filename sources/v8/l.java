package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new r(1);
    public int f48212a;
    public Bundle f48213b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f48212a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.b(parcel, 3, this.f48213b);
        g0.r(parcel, q6);
    }
}
