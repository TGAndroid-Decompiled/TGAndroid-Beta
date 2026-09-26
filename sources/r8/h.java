package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f42409a;
    public String f42410b;
    public String f42411c;
    public String d;
    public String e;
    public String f42412f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f42409a);
        f0.l(parcel, 3, this.f42410b);
        f0.l(parcel, 4, this.f42411c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f42412f);
        f0.l(parcel, 8, this.h);
        f0.r(parcel, q6);
    }
}
