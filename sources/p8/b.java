package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f55488a;
    public DataHolder f55489b;
    public ParcelFileDescriptor f55490c;
    public long d;
    public byte[] f55491e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f55488a);
        bc.k(parcel, 3, this.f55489b, i7);
        bc.k(parcel, 4, this.f55490c, i7);
        long j3 = this.d;
        bc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        bc.c(parcel, 6, this.f55491e);
        bc.s(parcel, r10);
        this.f55490c = null;
    }
}
