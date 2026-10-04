package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f45879a;
    public String f45880b;
    public String f45881c;
    public String d;
    public String f45882e;
    public b f45883f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f45879a);
        g0.l(parcel, 3, this.f45880b);
        g0.l(parcel, 4, this.f45881c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f45882e);
        g0.k(parcel, 7, this.f45883f, i10);
        g0.k(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}
