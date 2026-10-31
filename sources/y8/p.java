package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f54262a;
    public final ParcelFileDescriptor f54263b;

    public p(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f54262a = i10;
        this.f54263b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54262a);
        w7.h0.k(parcel, 3, this.f54263b, i10);
        w7.h0.r(parcel, q6);
    }
}
