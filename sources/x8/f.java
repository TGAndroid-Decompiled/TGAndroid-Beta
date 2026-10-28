package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long f51755a;
    public long f51756b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        long j10 = this.f51755a;
        df.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f51756b;
        df.s(parcel, 3, 8);
        parcel.writeLong(j11);
        df.r(parcel, q5);
    }
}
