package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.m(19);
    public String f44013a;
    public String f44014b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f44013a);
        g0.l(parcel, 3, this.f44014b);
        g0.r(parcel, q6);
    }
}
