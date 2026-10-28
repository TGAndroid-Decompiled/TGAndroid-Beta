package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class v extends p6.a {
    public static final Parcelable.Creator<v> CREATOR = new d(16);
    public final int f52844a;
    public final boolean f52845b;

    public v(int i10, boolean z10) {
        this.f52844a = i10;
        this.f52845b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52844a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52845b ? 1 : 0);
        df.r(parcel, q5);
    }
}
