package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f51969a;
    public final ParcelFileDescriptor f51970b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f51969a = i10;
        this.f51970b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f51969a);
        w7.c0.k(parcel, 3, this.f51970b, i10 | 1);
        w7.c0.r(parcel, q6);
    }
}
