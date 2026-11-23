package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61801a;
    public String f61802b;
    public f f61803c;
    public g d;
    public g f61804e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61801a);
        cc.l(parcel, 3, this.f61802b);
        cc.k(parcel, 4, this.f61803c, i7);
        cc.k(parcel, 5, this.d, i7);
        cc.k(parcel, 6, this.f61804e, i7);
        cc.s(parcel, r10);
    }
}
