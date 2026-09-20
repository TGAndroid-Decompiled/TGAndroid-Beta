package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(5);
    public String f44566a;
    public Bundle f44567b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44566a);
        f0.b(parcel, 3, this.f44567b);
        f0.r(parcel, q6);
    }
}
