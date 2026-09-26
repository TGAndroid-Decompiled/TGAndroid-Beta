package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f42386a;
    public String f42387b;
    public String f42388c;
    public String d;
    public String e;
    public b f42389f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f42386a);
        f0.l(parcel, 3, this.f42387b);
        f0.l(parcel, 4, this.f42388c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.k(parcel, 7, this.f42389f, i10);
        f0.k(parcel, 8, this.h, i10);
        f0.r(parcel, q6);
    }
}
