package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f47741a;
    public String f47742b;
    public String f47743c;
    public String d;
    public String f47744e;
    public String f47745f;
    public String h;
    public String f47746n;
    public String f47747r;
    public boolean f47748s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f47741a);
        e0.l(parcel, 3, this.f47742b);
        e0.l(parcel, 4, this.f47743c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f47744e);
        e0.l(parcel, 7, this.f47745f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f47746n);
        e0.l(parcel, 10, this.f47747r);
        boolean z10 = this.f47748s;
        e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 12, this.v);
        e0.r(parcel, q6);
    }
}
