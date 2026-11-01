package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new s(2);
    public String f50751a;
    public Bundle f50752b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50751a);
        h0.b(parcel, 3, this.f50752b);
        h0.r(parcel, q6);
    }
}
