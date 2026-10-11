package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f47162a;
    public String f47163b;
    public String f47164c;
    public String d;
    public String f47165e;
    public String f47166f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47162a);
        d0.l(parcel, 3, this.f47163b);
        d0.l(parcel, 4, this.f47164c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f47165e);
        d0.l(parcel, 7, this.f47166f);
        d0.l(parcel, 8, this.h);
        d0.r(parcel, q6);
    }
}
