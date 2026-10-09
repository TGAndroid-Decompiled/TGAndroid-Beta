package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49487a;
    public String f49488b;
    public String f49489c;
    public String d;
    public String f49490e;
    public String f49491f;
    public String h;
    public String f49492n;
    public String f49493r;
    public boolean f49494s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49487a);
        d0.l(parcel, 3, this.f49488b);
        d0.l(parcel, 4, this.f49489c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49490e);
        d0.l(parcel, 7, this.f49491f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49492n);
        d0.l(parcel, 10, this.f49493r);
        boolean z10 = this.f49494s;
        d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 12, this.v);
        d0.r(parcel, q6);
    }
}
