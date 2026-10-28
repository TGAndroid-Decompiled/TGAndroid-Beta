package z8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends p6.a {
    public static final Parcelable.Creator<r> CREATOR = new d(12);
    public final int f52827a;
    public final ParcelFileDescriptor f52828b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f52827a = i10;
        this.f52828b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52827a);
        df.k(parcel, 3, this.f52828b, i10);
        df.r(parcel, q5);
    }
}
