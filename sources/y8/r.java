package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f51817a;
    public final ParcelFileDescriptor f51818b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f51817a = i10;
        this.f51818b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51817a);
        w7.d0.k(parcel, 3, this.f51818b, i10);
        w7.d0.r(parcel, q6);
    }
}
