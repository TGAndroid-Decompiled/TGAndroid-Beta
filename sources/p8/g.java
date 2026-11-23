package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(21);
    public final String f55620a;

    public g(String str) {
        this.f55620a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f55620a);
        cc.s(parcel, r10);
    }
}
