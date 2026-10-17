package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f50063a;
    public final boolean f50064b;

    public s(int i10, boolean z10) {
        this.f50063a = i10;
        this.f50064b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50063a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50064b ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
