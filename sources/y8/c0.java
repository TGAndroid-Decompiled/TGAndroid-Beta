package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 extends o6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f46347a;
    public final l0 f46348b;

    public c0(int i10, l0 l0Var) {
        this.f46347a = i10;
        this.f46348b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46347a);
        w7.e0.k(parcel, 3, this.f46348b, i10);
        w7.e0.r(parcel, q6);
    }
}
