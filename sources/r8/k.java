package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.n(18);
    public String f46404a;
    public String f46405b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46404a);
        h0.l(parcel, 3, this.f46405b);
        h0.r(parcel, q6);
    }
}
