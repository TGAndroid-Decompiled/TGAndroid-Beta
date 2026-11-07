package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59225a;
    public String f59226b;
    public String f59227c;
    public String d;
    public String f59228e;
    public String f59229f;
    public String h;
    public String f59230n;
    public String f59231r;
    public boolean f59232s;
    public String f59233w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59225a);
        xb.l(parcel, 3, this.f59226b);
        xb.l(parcel, 4, this.f59227c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59228e);
        xb.l(parcel, 7, this.f59229f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59230n);
        xb.l(parcel, 10, this.f59231r);
        boolean z9 = this.f59232s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.f59233w);
        xb.s(parcel, r10);
    }
}
