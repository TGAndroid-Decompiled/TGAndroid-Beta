package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(5);
    public String f49737a;
    public Bundle f49738b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49737a);
        c0.b(parcel, 3, this.f49738b);
        c0.r(parcel, q6);
    }
}
