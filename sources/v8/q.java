package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
    public String f49610a;
    public String f49611b;
    public String f49612c;
    public String d;
    public String f49613e;
    public String f49614f;
    public String h;
    public String f49615n;
    public String f49616r;
    public boolean f49617s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49610a);
        d0.l(parcel, 3, this.f49611b);
        d0.l(parcel, 4, this.f49612c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49613e);
        d0.l(parcel, 7, this.f49614f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49615n);
        d0.l(parcel, 10, this.f49616r);
        boolean z10 = this.f49617s;
        d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 12, this.v);
        d0.r(parcel, q6);
    }
}
