package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f56411a;
    public String f56412b;
    public String f56413c;
    public String d;
    public String f56414e;
    public b f56415f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56411a);
        xb.l(parcel, 3, this.f56412b);
        xb.l(parcel, 4, this.f56413c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56414e);
        xb.k(parcel, 7, this.f56415f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
