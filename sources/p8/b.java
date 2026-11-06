package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.data.DataHolder;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String f53403a;
    public DataHolder f53404b;
    public ParcelFileDescriptor f53405c;
    public long d;
    public byte[] f53406e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f53403a);
        wb.k(parcel, 3, this.f53404b, i7);
        wb.k(parcel, 4, this.f53405c, i7);
        long j3 = this.d;
        wb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        wb.c(parcel, 6, this.f53406e);
        wb.s(parcel, r10);
        this.f53405c = null;
    }
}
