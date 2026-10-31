package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f54308a;
    public final ParcelFileDescriptor f54309b;

    public z(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f54308a = i10;
        this.f54309b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54308a);
        w7.h0.k(parcel, 3, this.f54309b, i10 | 1);
        w7.h0.r(parcel, q6);
    }
}
