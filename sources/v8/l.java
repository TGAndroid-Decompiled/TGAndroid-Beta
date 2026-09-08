package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new r(1);
    public int f47759a;
    public Bundle f47760b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f47759a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.b(parcel, 3, this.f47760b);
        e0.r(parcel, q6);
    }
}
