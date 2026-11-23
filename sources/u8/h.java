package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f58626a;
    public String f58627b;
    public String f58628c;
    public String d;
    public String f58629e;
    public String f58630f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58626a);
        cc.l(parcel, 3, this.f58627b);
        cc.l(parcel, 4, this.f58628c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f58629e);
        cc.l(parcel, 7, this.f58630f);
        cc.l(parcel, 8, this.h);
        cc.s(parcel, r10);
    }
}
