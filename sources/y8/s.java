package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f50524a;
    public final boolean f50525b;

    public s(int i10, boolean z10) {
        this.f50524a = i10;
        this.f50525b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50524a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50525b ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
