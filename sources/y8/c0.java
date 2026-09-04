package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 extends o6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f49579a;
    public final l0 f49580b;

    public c0(int i10, l0 l0Var) {
        this.f49579a = i10;
        this.f49580b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49579a);
        w7.e0.k(parcel, 3, this.f49580b, i10);
        w7.e0.r(parcel, q6);
    }
}
