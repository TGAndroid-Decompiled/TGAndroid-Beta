package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f50093a;
    public final boolean f50094b;
    public final boolean f50095c;

    public t(int i10, boolean z10, boolean z11) {
        this.f50093a = i10;
        this.f50094b = z10;
        this.f50095c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50093a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50094b ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f50095c ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
