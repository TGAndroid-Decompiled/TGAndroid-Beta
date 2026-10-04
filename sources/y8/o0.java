package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f50518a;
    public final String f50519b;
    public final long f50520c;

    public o0(long j3, String str, String str2) {
        this.f50518a = str;
        this.f50519b = str2;
        this.f50520c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f50518a);
        w7.g0.l(parcel, 3, this.f50519b);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.f50520c);
        w7.g0.r(parcel, q6);
    }
}
