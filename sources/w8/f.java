package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long f48934a;
    public long f48935b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        long j10 = this.f48934a;
        f0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f48935b;
        f0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f0.r(parcel, q6);
    }
}
