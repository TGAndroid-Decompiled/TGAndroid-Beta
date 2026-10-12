package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f47286a;
    public String f47287b;
    public String f47288c;
    public String d;
    public String f47289e;
    public String f47290f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f47286a);
        c0.l(parcel, 3, this.f47287b);
        c0.l(parcel, 4, this.f47288c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f47289e);
        c0.l(parcel, 7, this.f47290f);
        c0.l(parcel, 8, this.h);
        c0.r(parcel, q6);
    }
}
