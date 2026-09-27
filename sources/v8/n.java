package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f44578a;
    public String f44579b;
    public String f44580c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f44578a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 2, this.f44579b);
        f0.l(parcel, 3, this.f44580c);
        f0.r(parcel, q6);
    }
}
