package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new r(0);
    public int f47729a;
    public String f47730b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f47729a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f47730b);
        e0.r(parcel, q6);
    }
}
