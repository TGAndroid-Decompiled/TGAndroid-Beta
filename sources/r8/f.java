package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f45915a;
    public String f45916b;
    public String f45917c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45915a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45916b);
        g0.l(parcel, 4, this.f45917c);
        g0.l(parcel, 5, this.d);
        g0.r(parcel, q6);
    }
}
