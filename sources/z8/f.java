package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long f60022a;
    public long f60023b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        long j3 = this.f60022a;
        xb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f60023b;
        xb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        xb.s(parcel, r10);
    }
}
