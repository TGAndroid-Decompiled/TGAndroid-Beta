package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f45887a;
    public String f45888b;
    public String f45889c;
    public String d;
    public String f45890e;
    public b f45891f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45887a);
        g0.l(parcel, 3, this.f45888b);
        g0.l(parcel, 4, this.f45889c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f45890e);
        g0.k(parcel, 7, this.f45891f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}
