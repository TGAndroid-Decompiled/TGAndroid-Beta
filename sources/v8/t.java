package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new s(3);
    public String f48317a;
    public Bundle f48318b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48317a);
        f0.b(parcel, 3, this.f48318b);
        f0.r(parcel, q6);
    }
}
