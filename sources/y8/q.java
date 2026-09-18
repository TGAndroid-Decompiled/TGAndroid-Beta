package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f46432a;
    public final ParcelFileDescriptor f46433b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f46432a = i10;
        this.f46433b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46432a);
        w7.e0.k(parcel, 3, this.f46433b, i10);
        w7.e0.r(parcel, q6);
    }
}
