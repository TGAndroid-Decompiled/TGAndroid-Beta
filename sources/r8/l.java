package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.m(18);
    public String f44015a;
    public String f44016b;
    public int f44017c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f44015a);
        g0.l(parcel, 3, this.f44016b);
        int i11 = this.f44017c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
