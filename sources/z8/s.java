package z8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class s extends p6.a {
    public static final Parcelable.Creator<s> CREATOR = new d(13);
    public final int f52773a;
    public final ParcelFileDescriptor f52774b;

    public s(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f52773a = i10;
        this.f52774b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52773a);
        df.k(parcel, 3, this.f52774b, i10);
        df.r(parcel, q5);
    }
}
