package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f51813a;
    public final ParcelFileDescriptor f51814b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f51813a = i10;
        this.f51814b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51813a);
        w7.d0.k(parcel, 3, this.f51814b, i10);
        w7.d0.r(parcel, q6);
    }
}
