package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f47090a;
    public String f47091b;
    public String f47092c;
    public String d;
    public String f47093e;
    public b f47094f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47090a);
        d0.l(parcel, 3, this.f47091b);
        d0.l(parcel, 4, this.f47092c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f47093e);
        d0.k(parcel, 7, this.f47094f, i10);
        d0.k(parcel, 8, this.h, i10);
        d0.r(parcel, q6);
    }
}
