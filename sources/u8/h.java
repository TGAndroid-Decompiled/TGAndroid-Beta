package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f56425a;
    public String f56426b;
    public String f56427c;
    public String d;
    public String f56428e;
    public String f56429f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56425a);
        xb.l(parcel, 3, this.f56426b);
        xb.l(parcel, 4, this.f56427c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56428e);
        xb.l(parcel, 7, this.f56429f);
        xb.l(parcel, 8, this.h);
        xb.s(parcel, r10);
    }
}
