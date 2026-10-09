package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f51804a;
    public final String f51805b;
    public final long f51806c;

    public o0(long j3, String str, String str2) {
        this.f51804a = str;
        this.f51805b = str2;
        this.f51806c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f51804a);
        w7.d0.l(parcel, 3, this.f51805b);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.f51806c);
        w7.d0.r(parcel, q6);
    }
}
