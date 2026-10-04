package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f45916a;
    public String f45917b;
    public int f45918c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45916a);
        g0.l(parcel, 3, this.f45917b);
        int i11 = this.f45918c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
