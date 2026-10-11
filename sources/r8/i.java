package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(19);
    public int f47201a;
    public String f47202b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47201a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f47202b);
        d0.r(parcel, q6);
    }
}
