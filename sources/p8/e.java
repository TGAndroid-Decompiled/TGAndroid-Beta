package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(18);
    public final String f55503a;

    public e(String str) {
        this.f55503a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f55503a);
        cc.s(parcel, r10);
    }
}
