package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f48897a;
    public d f48898b;
    public f f48899c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48897a);
        g0.k(parcel, 3, this.f48898b, i10);
        g0.k(parcel, 5, this.f48899c, i10);
        g0.r(parcel, q6);
    }
}
