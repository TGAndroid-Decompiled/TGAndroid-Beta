package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f42098a;
    public String f42099b;
    public String f42100c;
    public String d;
    public String e;
    public b f42101f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f42098a);
        e0.l(parcel, 3, this.f42099b);
        e0.l(parcel, 4, this.f42100c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.k(parcel, 7, this.f42101f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}
