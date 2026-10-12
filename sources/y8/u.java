package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f52054a;
    public final boolean f52055b;

    public u(int i10, boolean z10) {
        this.f52054a = i10;
        this.f52055b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52054a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52055b ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
