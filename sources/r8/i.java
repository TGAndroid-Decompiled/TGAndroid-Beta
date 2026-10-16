package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.m(17);
    public int f43768a;
    public String f43769b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f43768a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f43769b);
        f0.r(parcel, q6);
    }
}
