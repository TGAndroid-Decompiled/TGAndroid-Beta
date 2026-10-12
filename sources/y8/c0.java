package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 extends o6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f51989a;
    public final l0 f51990b;

    public c0(int i10, l0 l0Var) {
        this.f51989a = i10;
        this.f51990b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f51989a);
        w7.c0.k(parcel, 3, this.f51990b, i10);
        w7.c0.r(parcel, q6);
    }
}
