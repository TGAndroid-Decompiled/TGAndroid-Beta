package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long f45153a;
    public long f45154b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        long j3 = this.f45153a;
        f0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f45154b;
        f0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        f0.r(parcel, q6);
    }
}
