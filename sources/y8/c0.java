package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 extends o6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f50461a;
    public final l0 f50462b;

    public c0(int i10, l0 l0Var) {
        this.f50461a = i10;
        this.f50462b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50461a);
        w7.g0.k(parcel, 3, this.f50462b, i10);
        w7.g0.r(parcel, q6);
    }
}
