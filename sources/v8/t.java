package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(5);
    public String f43288a;
    public Bundle f43289b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43288a);
        e0.b(parcel, 3, this.f43289b);
        e0.r(parcel, q6);
    }
}
