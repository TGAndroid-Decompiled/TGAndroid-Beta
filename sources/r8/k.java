package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.j(21);
    public String f45014a;
    public String f45015b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f45014a);
        e0.l(parcel, 3, this.f45015b);
        e0.r(parcel, q6);
    }
}
