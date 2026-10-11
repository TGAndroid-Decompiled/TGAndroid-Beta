package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new r(0);
    public int f49598a;
    public String f49599b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f49598a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f49599b);
        d0.r(parcel, q6);
    }
}
