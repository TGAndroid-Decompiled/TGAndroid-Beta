package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f47762a;
    public String f47763b;
    public String f47764c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f47762a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 2, this.f47763b);
        e0.l(parcel, 3, this.f47764c);
        e0.r(parcel, q6);
    }
}
