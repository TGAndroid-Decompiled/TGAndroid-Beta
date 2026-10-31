package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends o6.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0(0);
    public final int f54244a;
    public final f f54245b;

    public k0(int i10, f fVar) {
        this.f54244a = i10;
        this.f54245b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54244a);
        w7.h0.k(parcel, 3, this.f54245b, i10);
        w7.h0.r(parcel, q6);
    }
}
