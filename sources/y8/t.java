package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f50529a;
    public final boolean f50530b;
    public final boolean f50531c;

    public t(int i10, boolean z10, boolean z11) {
        this.f50529a = i10;
        this.f50530b = z10;
        this.f50531c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50529a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50530b ? 1 : 0);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f50531c ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
