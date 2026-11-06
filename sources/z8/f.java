package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long f59916a;
    public long f59917b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        long j3 = this.f59916a;
        wb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.f59917b;
        wb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        wb.s(parcel, r10);
    }
}
