package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f50532a;
    public final boolean f50533b;

    public s(int i10, boolean z10) {
        this.f50532a = i10;
        this.f50533b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50532a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50533b ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
