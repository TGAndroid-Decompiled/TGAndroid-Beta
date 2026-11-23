package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f55611a;
    public DataHolder f55612b;
    public ParcelFileDescriptor f55613c;
    public long d;
    public byte[] f55614e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f55611a);
        cc.k(parcel, 3, this.f55612b, i7);
        cc.k(parcel, 4, this.f55613c, i7);
        long j3 = this.d;
        cc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        cc.c(parcel, 6, this.f55614e);
        cc.s(parcel, r10);
        this.f55613c = null;
    }
}
