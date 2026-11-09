package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59324a;
    public String f59325b;
    public String f59326c;
    public String d;
    public String f59327e;
    public String f59328f;
    public String h;
    public String f59329n;
    public String f59330r;
    public boolean f59331s;
    public String f59332w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59324a);
        xb.l(parcel, 3, this.f59325b);
        xb.l(parcel, 4, this.f59326c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59327e);
        xb.l(parcel, 7, this.f59328f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59329n);
        xb.l(parcel, 10, this.f59330r);
        boolean z9 = this.f59331s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.f59332w);
        xb.s(parcel, r10);
    }
}
