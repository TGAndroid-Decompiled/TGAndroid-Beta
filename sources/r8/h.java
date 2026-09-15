package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f42125a;
    public String f42126b;
    public String f42127c;
    public String d;
    public String e;
    public String f42128f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f42125a);
        e0.l(parcel, 3, this.f42126b);
        e0.l(parcel, 4, this.f42127c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f42128f);
        e0.l(parcel, 8, this.h);
        e0.r(parcel, q6);
    }
}
