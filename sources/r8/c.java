package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.n(10);
    public String f46373a;
    public String f46374b;
    public String f46375c;
    public String d;
    public String e;
    public b f46376f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46373a);
        h0.l(parcel, 3, this.f46374b);
        h0.l(parcel, 4, this.f46375c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.k(parcel, 7, this.f46376f, i10);
        h0.k(parcel, 8, this.h, i10);
        h0.r(parcel, q6);
    }
}
