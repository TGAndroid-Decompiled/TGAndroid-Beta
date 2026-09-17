package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f49677a;
    public final boolean f49678b;
    public final boolean f49679c;

    public t(int i10, boolean z10, boolean z11) {
        this.f49677a = i10;
        this.f49678b = z10;
        this.f49679c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49677a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49678b ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f49679c ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
