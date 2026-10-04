package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f48221a;
    public String f48222b;
    public String f48223c;
    public String d;
    public String f48224e;
    public String f48225f;
    public String h;
    public String f48226n;
    public String f48227r;
    public boolean f48228s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48221a);
        g0.l(parcel, 3, this.f48222b);
        g0.l(parcel, 4, this.f48223c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f48224e);
        g0.l(parcel, 7, this.f48225f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f48226n);
        g0.l(parcel, 10, this.f48227r);
        boolean z10 = this.f48228s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 12, this.v);
        g0.r(parcel, q6);
    }
}
