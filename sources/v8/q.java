package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49489a;
    public String f49490b;
    public String f49491c;
    public String d;
    public String f49492e;
    public String f49493f;
    public String h;
    public String f49494n;
    public String f49495r;
    public boolean f49496s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49489a);
        d0.l(parcel, 3, this.f49490b);
        d0.l(parcel, 4, this.f49491c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49492e);
        d0.l(parcel, 7, this.f49493f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49494n);
        d0.l(parcel, 10, this.f49495r);
        boolean z10 = this.f49496s;
        d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 12, this.v);
        d0.r(parcel, q6);
    }
}
