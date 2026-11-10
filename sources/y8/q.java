package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59322a;
    public String f59323b;
    public String f59324c;
    public String d;
    public String f59325e;
    public String f59326f;
    public String h;
    public String f59327n;
    public String f59328r;
    public boolean f59329s;
    public String f59330w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59322a);
        xb.l(parcel, 3, this.f59323b);
        xb.l(parcel, 4, this.f59324c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59325e);
        xb.l(parcel, 7, this.f59326f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59327n);
        xb.l(parcel, 10, this.f59328r);
        boolean z9 = this.f59329s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.f59330w);
        xb.s(parcel, r10);
    }
}
