package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f57935a;
    public String f57936b;
    public String f57937c;
    public String d;
    public String f57938e;
    public String f57939f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f57935a);
        yb.l(parcel, 3, this.f57936b);
        yb.l(parcel, 4, this.f57937c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f57938e);
        yb.l(parcel, 7, this.f57939f);
        yb.l(parcel, 8, this.h);
        yb.s(parcel, r10);
    }
}
