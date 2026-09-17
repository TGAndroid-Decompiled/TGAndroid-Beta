package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f44273a;
    public String f44274b;
    public String f44275c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f44273a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 2, this.f44274b);
        e0.l(parcel, 3, this.f44275c);
        e0.r(parcel, q6);
    }
}
