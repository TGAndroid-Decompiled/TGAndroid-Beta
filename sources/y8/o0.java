package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new l0(3);
    public final int f54281a;
    public final k f54282b;

    public o0(int i10, k kVar) {
        this.f54281a = i10;
        this.f54282b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54281a);
        w7.h0.k(parcel, 3, this.f54282b, i10);
        w7.h0.r(parcel, q6);
    }
}
