package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f52041a;
    public final ParcelFileDescriptor f52042b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f52041a = i10;
        this.f52042b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52041a);
        w7.c0.k(parcel, 3, this.f52042b, i10);
        w7.c0.r(parcel, q6);
    }
}
