package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f54912a;
    public DataHolder f54913b;
    public ParcelFileDescriptor f54914c;
    public long d;
    public byte[] f54915e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f54912a);
        yb.k(parcel, 3, this.f54913b, i7);
        yb.k(parcel, 4, this.f54914c, i7);
        long j3 = this.d;
        yb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        yb.c(parcel, 6, this.f54915e);
        yb.s(parcel, r10);
        this.f54914c = null;
    }
}
