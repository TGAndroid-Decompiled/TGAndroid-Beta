package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long f61222a;
    public long f61223b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        long j3 = this.f61222a;
        yb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f61223b;
        yb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        yb.s(parcel, r10);
    }
}
