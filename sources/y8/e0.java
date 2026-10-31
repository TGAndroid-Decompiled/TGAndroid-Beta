package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 extends o6.a {
    public static final Parcelable.Creator<e0> CREATOR = new c(28);
    public final int f54222a;

    public e0(int i10) {
        this.f54222a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54222a);
        w7.h0.r(parcel, q6);
    }
}
