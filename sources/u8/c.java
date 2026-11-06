package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f56309a;
    public String f56310b;
    public String f56311c;
    public String d;
    public String f56312e;
    public b f56313f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56309a);
        xb.l(parcel, 3, this.f56310b);
        xb.l(parcel, 4, this.f56311c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56312e);
        xb.k(parcel, 7, this.f56313f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
