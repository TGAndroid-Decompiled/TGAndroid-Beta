package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f51828a;
    public final boolean f51829b;

    public u(int i10, boolean z10) {
        this.f51828a = i10;
        this.f51829b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51828a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51829b ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
