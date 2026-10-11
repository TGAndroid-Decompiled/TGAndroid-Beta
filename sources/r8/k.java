package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.j(21);
    public String f47205a;
    public String f47206b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47205a);
        d0.l(parcel, 3, this.f47206b);
        d0.r(parcel, q6);
    }
}
