package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new s(1);
    public int f50718a;
    public String f50719b;
    public String f50720c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f50718a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 2, this.f50719b);
        h0.l(parcel, 3, this.f50720c);
        h0.r(parcel, q6);
    }
}
