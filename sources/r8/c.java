package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f41319a;
    public String f41320b;
    public String f41321c;
    public String d;
    public String e;
    public b f41322f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f41319a);
        e0.l(parcel, 3, this.f41320b);
        e0.l(parcel, 4, this.f41321c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.k(parcel, 7, this.f41322f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}
