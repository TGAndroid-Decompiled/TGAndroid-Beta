package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f56410a;
    public String f56411b;
    public String f56412c;
    public String d;
    public String f56413e;
    public b f56414f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56410a);
        xb.l(parcel, 3, this.f56411b);
        xb.l(parcel, 4, this.f56412c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56413e);
        xb.k(parcel, 7, this.f56414f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
