package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f54223a;
    public final j0 f54224b;

    public a0(int i10, j0 j0Var) {
        this.f54223a = i10;
        this.f54224b = j0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54223a);
        w7.h0.k(parcel, 3, this.f54224b, i10);
        w7.h0.r(parcel, q6);
    }
}
