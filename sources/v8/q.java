package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f44253a;
    public String f44254b;
    public String f44255c;
    public String d;
    public String e;
    public String f44256f;
    public String h;
    public String f44257n;
    public String f44258r;
    public boolean f44259s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44253a);
        e0.l(parcel, 3, this.f44254b);
        e0.l(parcel, 4, this.f44255c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f44256f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f44257n);
        e0.l(parcel, 10, this.f44258r);
        boolean z10 = this.f44259s;
        e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 12, this.v);
        e0.r(parcel, q6);
    }
}
