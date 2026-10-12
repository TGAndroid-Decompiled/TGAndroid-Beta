package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f48656a;
    public final ParcelFileDescriptor f48657b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f48656a = i10;
        this.f48657b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48656a);
        w7.g0.k(parcel, 3, this.f48657b, i10);
        w7.g0.r(parcel, q6);
    }
}
