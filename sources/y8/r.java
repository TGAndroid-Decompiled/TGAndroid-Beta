package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f49668a;
    public final ParcelFileDescriptor f49669b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f49668a = i10;
        this.f49669b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49668a);
        w7.e0.k(parcel, 3, this.f49669b, i10);
        w7.e0.r(parcel, q6);
    }
}
