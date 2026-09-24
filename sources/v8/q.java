package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f44525a;
    public String f44526b;
    public String f44527c;
    public String d;
    public String e;
    public String f44528f;
    public String h;
    public String f44529n;
    public String f44530r;
    public boolean f44531s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44525a);
        f0.l(parcel, 3, this.f44526b);
        f0.l(parcel, 4, this.f44527c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f44528f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f44529n);
        f0.l(parcel, 10, this.f44530r);
        boolean z10 = this.f44531s;
        f0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 12, this.v);
        f0.r(parcel, q6);
    }
}
