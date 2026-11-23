package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f61906a;
    public d f61907b;
    public f f61908c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61906a);
        cc.k(parcel, 3, this.f61907b, i7);
        cc.k(parcel, 5, this.f61908c, i7);
        cc.s(parcel, r10);
    }
}
