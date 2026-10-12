package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49717a;
    public String f49718b;
    public String f49719c;
    public String d;
    public String f49720e;
    public String f49721f;
    public String h;
    public String f49722n;
    public String f49723r;
    public boolean f49724s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49717a);
        c0.l(parcel, 3, this.f49718b);
        c0.l(parcel, 4, this.f49719c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f49720e);
        c0.l(parcel, 7, this.f49721f);
        c0.l(parcel, 8, this.h);
        c0.l(parcel, 9, this.f49722n);
        c0.l(parcel, 10, this.f49723r);
        boolean z10 = this.f49724s;
        c0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.l(parcel, 12, this.v);
        c0.r(parcel, q6);
    }
}
