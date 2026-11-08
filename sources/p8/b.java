package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f53494a;
    public DataHolder f53495b;
    public ParcelFileDescriptor f53496c;
    public long d;
    public byte[] f53497e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53494a);
        xb.k(parcel, 3, this.f53495b, i7);
        xb.k(parcel, 4, this.f53496c, i7);
        long j3 = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        xb.c(parcel, 6, this.f53497e);
        xb.s(parcel, r10);
        this.f53496c = null;
    }
}
