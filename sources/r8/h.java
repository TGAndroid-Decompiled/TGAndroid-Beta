package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.m(14);
    public String f45140a;
    public String f45141b;
    public String f45142c;
    public String d;
    public String e;
    public String f45143f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45140a);
        f0.l(parcel, 3, this.f45141b);
        f0.l(parcel, 4, this.f45142c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f45143f);
        f0.l(parcel, 8, this.h);
        f0.r(parcel, q6);
    }
}
