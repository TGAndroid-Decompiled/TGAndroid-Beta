package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59219a;
    public String f59220b;
    public String f59221c;
    public String d;
    public String f59222e;
    public String f59223f;
    public String h;
    public String f59224n;
    public String f59225r;
    public boolean f59226s;
    public String f59227w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59219a);
        xb.l(parcel, 3, this.f59220b);
        xb.l(parcel, 4, this.f59221c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59222e);
        xb.l(parcel, 7, this.f59223f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59224n);
        xb.l(parcel, 10, this.f59225r);
        boolean z9 = this.f59226s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.f59227w);
        xb.s(parcel, r10);
    }
}
