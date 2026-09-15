package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f46416a;
    public final boolean f46417b;
    public final boolean f46418c;

    public t(int i10, boolean z10, boolean z11) {
        this.f46416a = i10;
        this.f46417b = z10;
        this.f46418c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46416a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46417b ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f46418c ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
