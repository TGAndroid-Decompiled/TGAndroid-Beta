package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f50514a;
    public final String f50515b;

    public p0(int i10, String str) {
        this.f50514a = i10;
        this.f50515b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50514a);
        w7.g0.l(parcel, 3, this.f50515b);
        w7.g0.r(parcel, q6);
    }
}
