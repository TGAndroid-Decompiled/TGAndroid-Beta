package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f47260a;
    public String f47261b;
    public String f47262c;
    public String d;
    public String f47263e;
    public b f47264f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f47260a);
        c0.l(parcel, 3, this.f47261b);
        c0.l(parcel, 4, this.f47262c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f47263e);
        c0.k(parcel, 7, this.f47264f, i10);
        c0.k(parcel, 8, this.h, i10);
        c0.r(parcel, q6);
    }
}
