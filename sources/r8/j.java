package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(18);
    public String f45913a;
    public String f45914b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45913a);
        g0.l(parcel, 3, this.f45914b);
        g0.r(parcel, q6);
    }
}
