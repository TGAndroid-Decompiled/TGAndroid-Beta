package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f52030a;
    public final String f52031b;
    public final long f52032c;

    public o0(long j3, String str, String str2) {
        this.f52030a = str;
        this.f52031b = str2;
        this.f52032c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f52030a);
        w7.c0.l(parcel, 3, this.f52031b);
        w7.c0.s(parcel, 4, 8);
        parcel.writeLong(this.f52032c);
        w7.c0.r(parcel, q6);
    }
}
