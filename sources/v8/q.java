package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f44585a;
    public String f44586b;
    public String f44587c;
    public String d;
    public String e;
    public String f44588f;
    public String h;
    public String f44589n;
    public String f44590r;
    public boolean f44591s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44585a);
        f0.l(parcel, 3, this.f44586b);
        f0.l(parcel, 4, this.f44587c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f44588f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f44589n);
        f0.l(parcel, 10, this.f44590r);
        boolean z10 = this.f44591s;
        f0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 12, this.v);
        f0.r(parcel, q6);
    }
}
