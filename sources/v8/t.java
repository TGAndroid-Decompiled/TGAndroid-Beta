package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(5);
    public String f49499a;
    public Bundle f49500b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49499a);
        d0.b(parcel, 3, this.f49500b);
        d0.r(parcel, q6);
    }
}
