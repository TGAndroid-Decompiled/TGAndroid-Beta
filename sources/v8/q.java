package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f47770a;
    public String f47771b;
    public String f47772c;
    public String d;
    public String f47773e;
    public String f47774f;
    public String h;
    public String f47775n;
    public String f47776r;
    public boolean f47777s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f47770a);
        e0.l(parcel, 3, this.f47771b);
        e0.l(parcel, 4, this.f47772c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f47773e);
        e0.l(parcel, 7, this.f47774f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f47775n);
        e0.l(parcel, 10, this.f47776r);
        boolean z10 = this.f47777s;
        e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 12, this.v);
        e0.r(parcel, q6);
    }
}
