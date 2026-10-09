package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f51830a;
    public final boolean f51831b;

    public u(int i10, boolean z10) {
        this.f51830a = i10;
        this.f51831b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51830a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51831b ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
