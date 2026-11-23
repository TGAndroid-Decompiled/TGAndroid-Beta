package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f58511a;
    public String f58512b;
    public String f58513c;
    public String d;
    public String f58514e;
    public String f58515f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58511a);
        cc.l(parcel, 3, this.f58512b);
        cc.l(parcel, 4, this.f58513c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f58514e);
        cc.l(parcel, 7, this.f58515f);
        cc.l(parcel, 8, this.h);
        cc.s(parcel, r10);
    }
}
