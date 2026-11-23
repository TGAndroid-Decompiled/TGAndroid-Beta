package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61920a;
    public String f61921b;
    public f f61922c;
    public g d;
    public g f61923e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61920a);
        cc.l(parcel, 3, this.f61921b);
        cc.k(parcel, 4, this.f61922c, i7);
        cc.k(parcel, 5, this.d, i7);
        cc.k(parcel, 6, this.f61923e, i7);
        cc.s(parcel, r10);
    }
}
