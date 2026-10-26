package z8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class c0 extends p6.a {
    public static final Parcelable.Creator<c0> CREATOR = new d(23);
    public final int f52705a;
    public final ParcelFileDescriptor f52706b;

    public c0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f52705a = i10;
        this.f52706b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52705a);
        df.k(parcel, 3, this.f52706b, i10 | 1);
        df.r(parcel, q5);
    }
}
