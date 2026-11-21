package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f55529a;
    public DataHolder f55530b;
    public ParcelFileDescriptor f55531c;
    public long d;
    public byte[] f55532e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f55529a);
        bc.k(parcel, 3, this.f55530b, i7);
        bc.k(parcel, 4, this.f55531c, i7);
        long j3 = this.d;
        bc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        bc.c(parcel, 6, this.f55532e);
        bc.s(parcel, r10);
        this.f55531c = null;
    }
}
