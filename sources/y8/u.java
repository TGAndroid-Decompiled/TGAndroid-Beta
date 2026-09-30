package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f46702a;
    public final boolean f46703b;

    public u(int i10, boolean z10) {
        this.f46702a = i10;
        this.f46703b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46702a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46703b ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
