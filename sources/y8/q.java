package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f52037a;
    public final ParcelFileDescriptor f52038b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f52037a = i10;
        this.f52038b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52037a);
        w7.c0.k(parcel, 3, this.f52038b, i10);
        w7.c0.r(parcel, q6);
    }
}
