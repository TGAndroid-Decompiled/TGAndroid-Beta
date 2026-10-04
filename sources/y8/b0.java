package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f50457a;
    public final ParcelFileDescriptor f50458b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f50457a = i10;
        this.f50458b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50457a);
        w7.g0.k(parcel, 3, this.f50458b, i10 | 1);
        w7.g0.r(parcel, q6);
    }
}
