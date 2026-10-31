package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new l0(4);
    public final int f54264a;

    public p0(int i10) {
        this.f54264a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54264a);
        w7.h0.r(parcel, q6);
    }
}
