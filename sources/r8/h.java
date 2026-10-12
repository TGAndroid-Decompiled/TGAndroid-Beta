package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.m(14);
    public String f44005a;
    public String f44006b;
    public String f44007c;
    public String d;
    public String e;
    public String f44008f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f44005a);
        g0.l(parcel, 3, this.f44006b);
        g0.l(parcel, 4, this.f44007c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.l(parcel, 7, this.f44008f);
        g0.l(parcel, 8, this.h);
        g0.r(parcel, q6);
    }
}
