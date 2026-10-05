package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f50525a;
    public final String f50526b;
    public final long f50527c;

    public o0(long j3, String str, String str2) {
        this.f50525a = str;
        this.f50526b = str2;
        this.f50527c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f50525a);
        w7.g0.l(parcel, 3, this.f50526b);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.f50527c);
        w7.g0.r(parcel, q6);
    }
}
