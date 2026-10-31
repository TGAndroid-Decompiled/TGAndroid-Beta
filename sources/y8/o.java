package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f54258a;
    public final ParcelFileDescriptor f54259b;

    public o(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f54258a = i10;
        this.f54259b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54258a);
        w7.h0.k(parcel, 3, this.f54259b, i10);
        w7.h0.r(parcel, q6);
    }
}
