package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f50026a;
    public final String f50027b;
    public final long f50028c;

    public o0(long j10, String str, String str2) {
        this.f50026a = str;
        this.f50027b = str2;
        this.f50028c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f50026a);
        w7.f0.l(parcel, 3, this.f50027b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.f50028c);
        w7.f0.r(parcel, q6);
    }
}
