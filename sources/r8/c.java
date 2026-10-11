package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f47136a;
    public String f47137b;
    public String f47138c;
    public String d;
    public String f47139e;
    public b f47140f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47136a);
        d0.l(parcel, 3, this.f47137b);
        d0.l(parcel, 4, this.f47138c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f47139e);
        d0.k(parcel, 7, this.f47140f, i10);
        d0.k(parcel, 8, this.h, i10);
        d0.r(parcel, q6);
    }
}
