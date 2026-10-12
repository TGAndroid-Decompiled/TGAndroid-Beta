package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f47294a;
    public String f47295b;
    public String f47296c;
    public String d;
    public String f47297e;
    public String f47298f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f47294a);
        c0.l(parcel, 3, this.f47295b);
        c0.l(parcel, 4, this.f47296c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f47297e);
        c0.l(parcel, 7, this.f47298f);
        c0.l(parcel, 8, this.h);
        c0.r(parcel, q6);
    }
}
