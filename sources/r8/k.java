package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.j(21);
    public String f41350a;
    public String f41351b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f41350a);
        e0.l(parcel, 3, this.f41351b);
        e0.r(parcel, q6);
    }
}
