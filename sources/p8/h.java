package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(22);
    public final int f55621a;
    public final boolean f55622b;

    public h(int i7, boolean z10) {
        this.f55621a = i7;
        this.f55622b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f55621a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55622b ? 1 : 0);
        cc.s(parcel, r10);
    }
}
