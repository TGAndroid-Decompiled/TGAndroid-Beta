package x7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import h7.r8;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new w7.f(9);

    public String f49369a;

    public DataHolder f49370b;

    public ParcelFileDescriptor f49371c;
    public long d;

    public byte[] f49372e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f49369a);
        r8.k(parcel, 3, this.f49370b, i10);
        r8.k(parcel, 4, this.f49371c, i10);
        long j10 = this.d;
        r8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        r8.c(parcel, 6, this.f49372e);
        r8.r(parcel, iQ);
        this.f49371c = null;
    }
}
