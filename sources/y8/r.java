package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f50060a;
    public final ParcelFileDescriptor f50061b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f50060a = i10;
        this.f50061b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50060a);
        w7.f0.k(parcel, 3, this.f50061b, i10);
        w7.f0.r(parcel, q6);
    }
}
