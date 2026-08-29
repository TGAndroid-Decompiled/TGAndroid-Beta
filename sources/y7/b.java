package y7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new k(13);
    public String f50499a;
    public DataHolder f50500b;
    public ParcelFileDescriptor f50501c;
    public long d;
    public byte[] f50502e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f50499a);
        o.k(parcel, 3, this.f50500b, i10);
        o.k(parcel, 4, this.f50501c, i10);
        long j10 = this.d;
        o.s(parcel, 5, 8);
        parcel.writeLong(j10);
        o.c(parcel, 6, this.f50502e);
        o.r(parcel, q6);
        this.f50501c = null;
    }
}
