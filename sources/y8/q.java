package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61228a;
    public String f61229b;
    public String f61230c;
    public String d;
    public String f61231e;
    public String f61232f;
    public String h;
    public String f61233n;
    public String f61234r;
    public boolean f61235s;
    public String f61236w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61228a);
        cc.l(parcel, 3, this.f61229b);
        cc.l(parcel, 4, this.f61230c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f61231e);
        cc.l(parcel, 7, this.f61232f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f61233n);
        cc.l(parcel, 10, this.f61234r);
        boolean z10 = this.f61235s;
        cc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 12, this.f61236w);
        cc.s(parcel, r10);
    }
}
