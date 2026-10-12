package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f48645a;
    public final String f48646b;
    public final long f48647c;

    public o0(long j10, String str, String str2) {
        this.f48645a = str;
        this.f48646b = str2;
        this.f48647c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f48645a);
        w7.g0.l(parcel, 3, this.f48646b);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.f48647c);
        w7.g0.r(parcel, q6);
    }
}
