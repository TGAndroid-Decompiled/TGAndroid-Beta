package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f47734a;
    public String f47735b;
    public String f47736c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f47734a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 2, this.f47735b);
        e0.l(parcel, 3, this.f47736c);
        e0.r(parcel, q6);
    }
}
