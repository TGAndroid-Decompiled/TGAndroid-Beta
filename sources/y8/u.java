package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f49652a;
    public final boolean f49653b;

    public u(int i10, boolean z10) {
        this.f49652a = i10;
        this.f49653b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49652a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49653b ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
