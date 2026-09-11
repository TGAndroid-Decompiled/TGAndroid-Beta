package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f49639a;
    public final ParcelFileDescriptor f49640b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f49639a = i10;
        this.f49640b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49639a);
        w7.e0.k(parcel, 3, this.f49640b, i10);
        w7.e0.r(parcel, q6);
    }
}
