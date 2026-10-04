package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends o6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(3);
    public final int f50527a;
    public final m f50528b;

    public q0(int i10, m mVar) {
        this.f50527a = i10;
        this.f50528b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50527a);
        w7.g0.k(parcel, 3, this.f50528b, i10);
        w7.g0.r(parcel, q6);
    }
}
