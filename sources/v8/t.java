package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(5);
    public String f48242a;
    public Bundle f48243b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48242a);
        g0.b(parcel, 3, this.f48243b);
        g0.r(parcel, q6);
    }
}
