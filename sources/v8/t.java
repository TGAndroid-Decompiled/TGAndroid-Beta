package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new s(3);
    public String f48332a;
    public Bundle f48333b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48332a);
        f0.b(parcel, 3, this.f48333b);
        f0.r(parcel, q6);
    }
}
