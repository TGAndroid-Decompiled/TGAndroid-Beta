package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new r(0);
    public int f48218a;
    public String f48219b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f48218a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f48219b);
        g0.r(parcel, q6);
    }
}
