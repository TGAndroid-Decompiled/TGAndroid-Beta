package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f50516a;
    public final ParcelFileDescriptor f50517b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f50516a = i10;
        this.f50517b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50516a);
        w7.g0.k(parcel, 3, this.f50517b, i10);
        w7.g0.r(parcel, q6);
    }
}
