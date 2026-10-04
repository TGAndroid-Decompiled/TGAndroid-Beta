package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f48896a;
    public d f48897b;
    public f f48898c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48896a);
        g0.k(parcel, 3, this.f48897b, i10);
        g0.k(parcel, 5, this.f48898c, i10);
        g0.r(parcel, q6);
    }
}
