package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f47196a;
    public String f47197b;
    public String f47198c;
    public String d;
    public String f47199e;
    public String f47200f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f47196a);
        d0.l(parcel, 3, this.f47197b);
        d0.l(parcel, 4, this.f47198c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f47199e);
        d0.l(parcel, 7, this.f47200f);
        d0.l(parcel, 8, this.h);
        d0.r(parcel, q6);
    }
}
