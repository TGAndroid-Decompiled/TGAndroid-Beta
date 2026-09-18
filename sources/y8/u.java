package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f46676a;
    public final boolean f46677b;

    public u(int i10, boolean z10) {
        this.f46676a = i10;
        this.f46677b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46676a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46677b ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
