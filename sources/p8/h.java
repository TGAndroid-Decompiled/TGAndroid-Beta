package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(22);
    public final int f54922a;
    public final boolean f54923b;

    public h(int i7, boolean z10) {
        this.f54922a = i7;
        this.f54923b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f54922a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f54923b ? 1 : 0);
        yb.s(parcel, r10);
    }
}
