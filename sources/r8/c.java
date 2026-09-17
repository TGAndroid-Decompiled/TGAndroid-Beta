package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String f44980a;
    public String f44981b;
    public String f44982c;
    public String d;
    public String f44983e;
    public b f44984f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44980a);
        e0.l(parcel, 3, this.f44981b);
        e0.l(parcel, 4, this.f44982c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f44983e);
        e0.k(parcel, 7, this.f44984f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}
