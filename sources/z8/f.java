package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long f61916a;
    public long f61917b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        long j3 = this.f61916a;
        cc.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f61917b;
        cc.q(parcel, 3, 8);
        parcel.writeLong(j10);
        cc.s(parcel, r10);
    }
}
