package w7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public String f48769a;
    public DataHolder f48770b;
    public ParcelFileDescriptor f48771c;
    public long d;
    public byte[] f48772e;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f48769a);
        p8.k(parcel, 3, this.f48770b, i9);
        p8.k(parcel, 4, this.f48771c, i9);
        long j10 = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        p8.c(parcel, 6, this.f48772e);
        p8.r(parcel, q10);
        this.f48771c = null;
    }
}
