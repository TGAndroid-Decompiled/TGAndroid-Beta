package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f58600a;
    public String f58601b;
    public String f58602c;
    public String d;
    public String f58603e;
    public b f58604f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58600a);
        cc.l(parcel, 3, this.f58601b);
        cc.l(parcel, 4, this.f58602c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f58603e);
        cc.k(parcel, 7, this.f58604f, i7);
        cc.k(parcel, 8, this.h, i7);
        cc.s(parcel, r10);
    }
}
