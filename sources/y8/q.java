package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f54286a;
    public final boolean f54287b;

    public q(int i10, boolean z10) {
        this.f54286a = i10;
        this.f54287b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54286a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54287b ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}
