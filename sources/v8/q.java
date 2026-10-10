package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49533a;
    public String f49534b;
    public String f49535c;
    public String d;
    public String f49536e;
    public String f49537f;
    public String h;
    public String f49538n;
    public String f49539r;
    public boolean f49540s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49533a);
        d0.l(parcel, 3, this.f49534b);
        d0.l(parcel, 4, this.f49535c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49536e);
        d0.l(parcel, 7, this.f49537f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49538n);
        d0.l(parcel, 10, this.f49539r);
        boolean z10 = this.f49540s;
        d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 12, this.v);
        d0.r(parcel, q6);
    }
}
