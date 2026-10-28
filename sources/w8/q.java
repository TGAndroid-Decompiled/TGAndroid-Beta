package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class q extends p6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(4);
    public String f51183a;
    public String f51184b;
    public String f51185c;
    public String d;
    public String e;
    public String f51186f;
    public String h;
    public String f51187n;
    public String f51188r;
    public boolean f51189s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51183a);
        df.l(parcel, 3, this.f51184b);
        df.l(parcel, 4, this.f51185c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f51186f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.f51187n);
        df.l(parcel, 10, this.f51188r);
        boolean z10 = this.f51189s;
        df.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 12, this.v);
        df.r(parcel, q5);
    }
}
