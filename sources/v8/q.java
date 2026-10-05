package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f48237a;
    public String f48238b;
    public String f48239c;
    public String d;
    public String f48240e;
    public String f48241f;
    public String h;
    public String f48242n;
    public String f48243r;
    public boolean f48244s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48237a);
        g0.l(parcel, 3, this.f48238b);
        g0.l(parcel, 4, this.f48239c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f48240e);
        g0.l(parcel, 7, this.f48241f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f48242n);
        g0.l(parcel, 10, this.f48243r);
        boolean z10 = this.f48244s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 12, this.v);
        g0.r(parcel, q6);
    }
}
