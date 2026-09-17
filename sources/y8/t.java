package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f46439a;
    public final boolean f46440b;
    public final boolean f46441c;

    public t(int i10, boolean z10, boolean z11) {
        this.f46439a = i10;
        this.f46440b = z10;
        this.f46441c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46439a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46440b ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f46441c ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
