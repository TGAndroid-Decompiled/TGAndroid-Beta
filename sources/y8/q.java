package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59315a;
    public String f59316b;
    public String f59317c;
    public String d;
    public String f59318e;
    public String f59319f;
    public String h;
    public String f59320n;
    public String f59321r;
    public boolean f59322s;
    public String f59323w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59315a);
        xb.l(parcel, 3, this.f59316b);
        xb.l(parcel, 4, this.f59317c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59318e);
        xb.l(parcel, 7, this.f59319f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59320n);
        xb.l(parcel, 10, this.f59321r);
        boolean z9 = this.f59322s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.f59323w);
        xb.s(parcel, r10);
    }
}
