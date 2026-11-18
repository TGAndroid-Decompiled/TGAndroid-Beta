package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long f61786a;
    public long f61787b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        long j3 = this.f61786a;
        bc.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f61787b;
        bc.q(parcel, 3, 8);
        parcel.writeLong(j10);
        bc.s(parcel, r10);
    }
}
