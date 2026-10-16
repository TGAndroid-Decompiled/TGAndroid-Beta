package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f48663a;
    public final boolean f48664b;
    public final boolean f48665c;

    public t(int i10, boolean z10, boolean z11) {
        this.f48663a = i10;
        this.f48664b = z10;
        this.f48665c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48663a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48664b ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f48665c ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
