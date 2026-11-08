package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f56399a;
    public String f56400b;
    public String f56401c;
    public String d;
    public String f56402e;
    public b f56403f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56399a);
        xb.l(parcel, 3, this.f56400b);
        xb.l(parcel, 4, this.f56401c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56402e);
        xb.k(parcel, 7, this.f56403f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
