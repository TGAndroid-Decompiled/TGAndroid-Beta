package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new w8.b(28);
    public long f59339a;
    public long f59340b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        long j10 = this.f59339a;
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f59340b;
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(j11);
        j8.a.t(parcel, s6);
    }
}
