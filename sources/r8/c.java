package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.m(11);
    public String f43982a;
    public String f43983b;
    public String f43984c;
    public String d;
    public String e;
    public b f43985f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f43982a);
        g0.l(parcel, 3, this.f43983b);
        g0.l(parcel, 4, this.f43984c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.k(parcel, 7, this.f43985f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}
