package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long f47501a;
    public long f47502b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        long j10 = this.f47501a;
        g0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f47502b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        g0.r(parcel, q6);
    }
}
