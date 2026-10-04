package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f45901a;
    public String f45902b;
    public String f45903c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45901a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45902b);
        g0.l(parcel, 4, this.f45903c);
        g0.l(parcel, 5, this.d);
        g0.r(parcel, q6);
    }
}
