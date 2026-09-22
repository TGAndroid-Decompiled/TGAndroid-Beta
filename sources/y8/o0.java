package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f46720a;
    public final String f46721b;
    public final long f46722c;

    public o0(long j3, String str, String str2) {
        this.f46720a = str;
        this.f46721b = str2;
        this.f46722c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46720a);
        w7.f0.l(parcel, 3, this.f46721b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.f46722c);
        w7.f0.r(parcel, q6);
    }
}
