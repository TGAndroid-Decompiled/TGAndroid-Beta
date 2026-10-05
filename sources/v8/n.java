package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f48230a;
    public String f48231b;
    public String f48232c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f48230a;
        g0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 2, this.f48231b);
        g0.l(parcel, 3, this.f48232c);
        g0.r(parcel, q6);
    }
}
