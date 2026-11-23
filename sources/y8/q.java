package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61109a;
    public String f61110b;
    public String f61111c;
    public String d;
    public String f61112e;
    public String f61113f;
    public String h;
    public String f61114n;
    public String f61115r;
    public boolean f61116s;
    public String f61117w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61109a);
        cc.l(parcel, 3, this.f61110b);
        cc.l(parcel, 4, this.f61111c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f61112e);
        cc.l(parcel, 7, this.f61113f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f61114n);
        cc.l(parcel, 10, this.f61115r);
        boolean z10 = this.f61116s;
        cc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 12, this.f61117w);
        cc.s(parcel, r10);
    }
}
