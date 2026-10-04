package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f45913a;
    public String f45914b;
    public String f45915c;
    public String d;
    public String f45916e;
    public String f45917f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45913a);
        g0.l(parcel, 3, this.f45914b);
        g0.l(parcel, 4, this.f45915c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f45916e);
        g0.l(parcel, 7, this.f45917f);
        g0.l(parcel, 8, this.h);
        g0.r(parcel, q6);
    }
}
