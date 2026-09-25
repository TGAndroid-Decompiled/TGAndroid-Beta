package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new r(0);
    public int f44528a;
    public String f44529b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f44528a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f44529b);
        f0.r(parcel, q6);
    }
}
