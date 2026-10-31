package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(19);
    public long f52762a;
    public long f52763b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        long j10 = this.f52762a;
        h0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f52763b;
        h0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        h0.r(parcel, q6);
    }
}
