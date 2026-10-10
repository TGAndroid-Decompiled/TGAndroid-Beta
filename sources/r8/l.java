package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f47127a;
    public String f47128b;
    public int f47129c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47127a);
        d0.l(parcel, 3, this.f47128b);
        int i11 = this.f47129c;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        d0.r(parcel, q6);
    }
}
