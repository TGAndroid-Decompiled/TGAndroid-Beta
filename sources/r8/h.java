package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.m(14);
    public String f45105a;
    public String f45106b;
    public String f45107c;
    public String d;
    public String e;
    public String f45108f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45105a);
        f0.l(parcel, 3, this.f45106b);
        f0.l(parcel, 4, this.f45107c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f45108f);
        f0.l(parcel, 8, this.h);
        f0.r(parcel, q6);
    }
}
