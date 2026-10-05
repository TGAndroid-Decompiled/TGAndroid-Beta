package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long f48922a;
    public long f48923b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        long j3 = this.f48922a;
        g0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f48923b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        g0.r(parcel, q6);
    }
}
