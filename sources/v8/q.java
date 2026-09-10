package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f43277a;
    public String f43278b;
    public String f43279c;
    public String d;
    public String e;
    public String f43280f;
    public String h;
    public String f43281n;
    public String f43282r;
    public boolean f43283s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43277a);
        e0.l(parcel, 3, this.f43278b);
        e0.l(parcel, 4, this.f43279c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f43280f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f43281n);
        e0.l(parcel, 10, this.f43282r);
        boolean z10 = this.f43283s;
        e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 12, this.v);
        e0.r(parcel, q6);
    }
}
