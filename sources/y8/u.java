package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f50549a;
    public final boolean f50550b;

    public u(int i10, boolean z10) {
        this.f50549a = i10;
        this.f50550b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50549a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50550b ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
