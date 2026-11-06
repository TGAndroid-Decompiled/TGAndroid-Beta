package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f56335a;
    public String f56336b;
    public String f56337c;
    public String d;
    public String f56338e;
    public String f56339f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f56335a);
        xb.l(parcel, 3, this.f56336b);
        xb.l(parcel, 4, this.f56337c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f56338e);
        xb.l(parcel, 7, this.f56339f);
        xb.l(parcel, 8, this.h);
        xb.s(parcel, r10);
    }
}
